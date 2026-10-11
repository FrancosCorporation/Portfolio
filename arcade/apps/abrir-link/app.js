const formulario = document.querySelector('#formulario-link');
const campoEndereco = document.querySelector('#endereco');
const mensagem = document.querySelector('#mensagem');

formulario.addEventListener('submit', (evento) => {
  evento.preventDefault();
  mensagem.classList.remove('erro');

  const informado = campoEndereco.value.trim();
  if (!informado) {
    mostrarErro('Digite um endereço para continuar.');
    campoEndereco.focus();
    return;
  }

  const enderecoCompleto = /^[a-z][a-z\d+.-]*:/i.test(informado)
    ? informado
    : `https://${informado}`;

  let destino;
  try {
    destino = new URL(enderecoCompleto);
  } catch {
    mostrarErro('Esse endereço não parece válido. Confira o texto e tente novamente.');
    campoEndereco.focus();
    return;
  }

  if (!['http:', 'https:'].includes(destino.protocol) || !destino.hostname) {
    mostrarErro('Use um endereço que comece com http:// ou https://.');
    campoEndereco.focus();
    return;
  }

  if (destino.username || destino.password) {
    mostrarErro('Remova usuário e senha do endereço antes de abrir a página.');
    campoEndereco.focus();
    return;
  }

  window.open(destino.href, '_blank', 'noopener,noreferrer');
  mensagem.textContent = 'A página foi solicitada em uma nova aba. Se nada abrir, permita pop-ups para este site.';
});

function mostrarErro(texto) {
  mensagem.textContent = texto;
  mensagem.classList.add('erro');
}
