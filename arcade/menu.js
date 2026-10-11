const VERSOES_POR_ORIGEM = [
  {
    origem: 'Java/Jogo Da Velha/',
    url: 'https://francoscorporation.github.io/jogo_da_velha_ia/',
    texto: 'Abrir jogo da velha',
  },
  {
    origem: 'Java/Projeto Calculadora/',
    url: 'https://github.com/FrancosCorporation/calculadora',
    texto: 'Abrir calculadora',
  },
  {
    origem: 'Java/Chat/',
    url: 'https://github.com/FrancosCorporation/chat_criptografado',
    texto: 'Abrir projeto do chat',
  },
  {
    origem: 'Java/Projeto Integrador Analisador de Csv/',
    url: 'https://github.com/FrancosCorporation/projeto_integrador_analisador_csv',
    texto: 'Abrir analisador CSV',
  },
];

const menu = document.querySelector('#menu');
const resumo = document.querySelector('#resumo');
const resultados = document.querySelector('#resultados');
const busca = document.querySelector('#busca');
const filtroStatus = document.querySelector('#filtro-status');
let apps = [];

function normalizar(texto) {
  return String(texto)
    .normalize('NFD')
    .replace(/[\u0300-\u036f]/g, '')
    .toLocaleLowerCase('pt-BR');
}

function criarLink(texto, href, { externo = true, principal = false } = {}) {
  const link = document.createElement('a');
  link.className = principal ? 'acao acao-principal' : 'acao';
  link.textContent = texto;
  link.href = href;
  if (externo) {
    link.target = '_blank';
    link.rel = 'noopener noreferrer';
  }
  return link;
}

function obterVersaoWeb(app) {
  if (typeof app.portadoEm === 'string' && app.portadoEm.startsWith('arcade/')) {
    return {
      url: `./${app.portadoEm.slice('arcade/'.length)}`,
      texto: 'Abrir versão web',
      externo: false,
    };
  }

  const versao = VERSOES_POR_ORIGEM.find(({ origem }) => app.arquivo.startsWith(origem));
  return versao ? { url: versao.url, texto: versao.texto, externo: true } : null;
}

function criarCard(app) {
  const card = document.createElement('article');
  card.className = 'card';

  const topo = document.createElement('div');
  topo.className = 'card-topo';

  const badge = document.createElement('span');
  const convertido = app.status === 'portado';
  badge.className = `badge ${convertido ? 'badge-convertido' : 'badge-pendente'}`;
  badge.textContent = convertido ? 'Convertido' : 'Na fila';
  topo.appendChild(badge);

  const categoria = document.createElement('span');
  categoria.className = 'categoria-tag';
  categoria.textContent = app.categoria;
  topo.appendChild(categoria);
  card.appendChild(topo);

  const titulo = document.createElement('h3');
  titulo.className = 'nome';
  titulo.textContent = app.nome;
  card.appendChild(titulo);

  const caminho = document.createElement('p');
  caminho.className = 'arquivo';
  caminho.textContent = app.arquivo;
  caminho.title = app.arquivo;
  card.appendChild(caminho);

  const acoes = document.createElement('div');
  acoes.className = 'acoes';
  const versao = obterVersaoWeb(app);
  if (versao) {
    acoes.appendChild(criarLink(versao.texto, versao.url, {
      externo: versao.externo,
      principal: true,
    }));
  } else {
    const estado = document.createElement('span');
    estado.className = 'versao-indisponivel';
    estado.textContent = convertido ? 'Versão web sem link cadastrado' : 'Conversão ainda não disponível';
    acoes.appendChild(estado);
  }

  const caminhoGitHub = app.arquivo
    .split('/')
    .map((parte) => encodeURIComponent(parte))
    .join('/');
  acoes.appendChild(criarLink(
    'Ver código Java',
    `https://github.com/FrancosCorporation/Portfolio/blob/master/${caminhoGitHub}`,
  ));
  card.appendChild(acoes);
  return card;
}

function renderizar() {
  const termo = normalizar(busca.value.trim());
  const status = filtroStatus.value;
  const filtrados = apps.filter((app) => {
    const combinaStatus = status === 'todos' || app.status === status;
    const texto = normalizar(`${app.nome} ${app.categoria} ${app.arquivo}`);
    return combinaStatus && texto.includes(termo);
  });

  menu.replaceChildren();
  resultados.textContent = `${filtrados.length} de ${apps.length} itens`;

  if (filtrados.length === 0) {
    const vazio = document.createElement('p');
    vazio.className = 'estado-vazio';
    vazio.textContent = 'Nenhum programa corresponde a esses filtros. Tente outro termo ou status.';
    menu.appendChild(vazio);
    return;
  }

  const porCategoria = new Map();
  for (const app of filtrados) {
    if (!porCategoria.has(app.categoria)) porCategoria.set(app.categoria, []);
    porCategoria.get(app.categoria).push(app);
  }

  const grupos = [...porCategoria.entries()].sort((a, b) => b[1].length - a[1].length);
  for (const [nomeCategoria, lista] of grupos) {
    const secao = document.createElement('section');
    secao.className = 'categoria';

    const titulo = document.createElement('h2');
    titulo.textContent = nomeCategoria;
    const quantidade = document.createElement('span');
    quantidade.className = 'quantidade';
    quantidade.textContent = String(lista.length);
    titulo.appendChild(quantidade);
    secao.appendChild(titulo);

    const grade = document.createElement('div');
    grade.className = 'grade';
    for (const app of lista) grade.appendChild(criarCard(app));
    secao.appendChild(grade);
    menu.appendChild(secao);
  }
}

async function carregarCatalogo() {
  try {
    const resposta = await fetch('manifest.json');
    if (!resposta.ok) throw new Error(`HTTP ${resposta.status}`);
    const manifesto = await resposta.json();
    if (!Array.isArray(manifesto.apps)) throw new Error('Formato do catálogo inválido');

    apps = manifesto.apps;
    const convertidos = apps.filter((app) => app.status === 'portado').length;
    resumo.textContent = `${apps.length} arquivos Java únicos · ${convertidos} marcados como convertidos · ${apps.length - convertidos} na fila`;
    renderizar();
    menu.setAttribute('aria-busy', 'false');
  } catch {
    resumo.textContent = 'Não foi possível carregar o catálogo.';
    menu.setAttribute('aria-busy', 'false');
    const erro = document.createElement('p');
    erro.className = 'estado-erro';
    erro.textContent = 'Verifique a conexão e recarregue a página para tentar novamente.';
    menu.replaceChildren(erro);
  }
}

busca.addEventListener('input', renderizar);
filtroStatus.addEventListener('change', renderizar);
carregarCatalogo();
