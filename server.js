import http from 'node:http';
import { readFile, realpath, stat } from 'node:fs/promises';
import { extname, join, resolve, sep } from 'node:path';
import { fileURLToPath } from 'node:url';

const PORT = Number(process.env.PORT || 3000);
const ROOT = resolve(fileURLToPath(new URL('./arcade/', import.meta.url)));
const MIME = {
  '.html': 'text/html; charset=utf-8',
  '.css': 'text/css; charset=utf-8',
  '.js': 'text/javascript; charset=utf-8',
  '.json': 'application/json; charset=utf-8',
  '.png': 'image/png',
  '.svg': 'image/svg+xml',
  '.webp': 'image/webp',
  '.ico': 'image/x-icon',
};
const SECURITY_HEADERS = {
  'X-Content-Type-Options': 'nosniff',
  'Referrer-Policy': 'no-referrer',
  'X-Frame-Options': 'DENY',
  'Content-Security-Policy': "default-src 'self'; script-src 'self'; style-src 'self'; connect-src 'self'; img-src 'self' data:; base-uri 'none'; object-src 'none'; frame-ancestors 'none'",
};

function estaNaRaiz(caminho) {
  return caminho === ROOT || caminho.startsWith(`${ROOT}${sep}`);
}

function responderErro(res, codigo, texto, metodo) {
  res.writeHead(codigo, {
    ...SECURITY_HEADERS,
    'Content-Type': 'text/plain; charset=utf-8',
    'Content-Length': Buffer.byteLength(texto),
  });
  res.end(metodo === 'HEAD' ? undefined : texto);
}

const server = http.createServer(async (req, res) => {
  if (req.method !== 'GET' && req.method !== 'HEAD') {
    res.setHeader('Allow', 'GET, HEAD');
    responderErro(res, 405, 'Método não permitido.', req.method);
    return;
  }

  try {
    const url = new URL(req.url || '/', 'http://localhost');
    const caminhoUrl = decodeURIComponent(url.pathname);
    let caminhoArquivo = resolve(ROOT, `.${caminhoUrl}`);
    if (!estaNaRaiz(caminhoArquivo)) {
      responderErro(res, 404, 'Página não encontrada.', req.method);
      return;
    }

    caminhoArquivo = await realpath(caminhoArquivo);
    if (!estaNaRaiz(caminhoArquivo)) {
      responderErro(res, 404, 'Página não encontrada.', req.method);
      return;
    }

    if ((await stat(caminhoArquivo)).isDirectory()) {
      if (caminhoUrl !== '/' && !caminhoUrl.endsWith('/')) {
        res.writeHead(301, { ...SECURITY_HEADERS, Location: `${url.pathname}/${url.search}` });
        res.end();
        return;
      }
      caminhoArquivo = await realpath(join(caminhoArquivo, 'index.html'));
      if (!estaNaRaiz(caminhoArquivo)) {
        responderErro(res, 404, 'Página não encontrada.', req.method);
        return;
      }
    }

    const conteudo = await readFile(caminhoArquivo);
    res.writeHead(200, {
      ...SECURITY_HEADERS,
      'Content-Type': MIME[extname(caminhoArquivo)] || 'application/octet-stream',
      'Content-Length': conteudo.length,
    });
    res.end(req.method === 'HEAD' ? undefined : conteudo);
  } catch {
    responderErro(res, 404, 'Página não encontrada.', req.method);
  }
});

if (!Number.isInteger(PORT) || PORT < 1 || PORT > 65535) {
  throw new RangeError('PORT deve ser um número entre 1 e 65535.');
}

server.listen(PORT, '127.0.0.1', () => {
  console.log(`Arcade Java → JS disponível em http://127.0.0.1:${PORT}/`);
});
