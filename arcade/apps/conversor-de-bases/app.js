const formulario = document.querySelector('#formulario-conversao');
const baseOrigem = document.querySelector('#base-origem');
const campoValor = document.querySelector('#valor');
const mensagem = document.querySelector('#mensagem');
const saidas = {
  2: document.querySelector('#resultado-binario'),
  8: document.querySelector('#resultado-octal'),
  10: document.querySelector('#resultado-decimal'),
  16: document.querySelector('#resultado-hexadecimal'),
};

const formatos = {
  2: { prefixo: '0b', digitos: /^[01]+$/ },
  8: { prefixo: '0o', digitos: /^[0-7]+$/ },
  10: { prefixo: '', digitos: /^\d+$/ },
  16: { prefixo: '0x', digitos: /^[\da-f]+$/i },
};

formulario.addEventListener('submit', (evento) => {
  evento.preventDefault();
  mensagem.classList.remove('erro');
  const informado = campoValor.value.trim();

  try {
    const decimal = interpretarInteiro(informado, Number(baseOrigem.value));
    const negativo = decimal < 0;
    const semSinal = BigInt(decimal);
    const bits = BigInt.asUintN(32, semSinal);

    saidas[2].textContent = negativo ? bits.toString(2) : decimal.toString(2);
    saidas[8].textContent = negativo ? bits.toString(8) : decimal.toString(8);
    saidas[10].textContent = String(decimal);
    saidas[16].textContent = negativo ? bits.toString(16) : decimal.toString(16);
    mensagem.textContent = 'Conversão concluída.';
  } catch (erro) {
    for (const saida of Object.values(saidas)) saida.textContent = '—';
    mensagem.textContent = erro.message;
    mensagem.classList.add('erro');
    campoValor.focus();
  }
});

function interpretarInteiro(texto, base) {
  const formato = formatos[base];
  const sinal = texto.startsWith('-') ? -1 : 1;
  const algarismos = texto.replace(/^[+-]/, '');

  if (!formato || !formato.digitos.test(algarismos)) {
    throw new Error(`Digite algarismos válidos para a base ${base}.`);
  }

  const magnitude = BigInt(`${formato.prefixo}${algarismos}`);
  const valor = sinal < 0 ? -magnitude : magnitude;
  if (valor < -2147483648n || valor > 2147483647n) {
    throw new Error('O valor excede o intervalo de inteiro de 32 bits usado pelo Java.');
  }

  return Number(valor);
}
