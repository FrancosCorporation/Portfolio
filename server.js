import http from 'node:http';
import { readFile, stat } from 'node:fs/promises';
import { extname, join, normalize } from 'node:path';
import { fileURLToPath } from 'node:url';

const PORT = process.env.PORT || 3000;
const ROOT = fileURLToPath(new URL('.', import.meta.url));
const MIME = {
  '.html': 'text/html; charset=utf-8',
  '.css': 'text/css; charset=utf-8',
  '.js': 'text/javascript; charset=utf-8',
  '.json': 'application/json; charset=utf-8',
  '.png': 'image/png',
  '.svg': 'image/svg+xml'
};

http.createServer(async (req, res) => {
  try {
    let caminho = req.url.split('?')[0];
    let arquivo = normalize(join(ROOT, caminho));
    if (!arquivo.startsWith(ROOT)) throw new Error('fora da raiz');
    // resolve diretório -> index.html
    if ((await stat(arquivo)).isDirectory()) {
      arquivo = join(arquivo, 'index.html');
    }
    const data = await readFile(arquivo);
    res.writeHead(200, { 'Content-Type': MIME[extname(arquivo)] || 'application/octet-stream' });
    res.end(data);
  } catch {
    res.writeHead(404, { 'Content-Type': 'text/plain; charset=utf-8' });
    res.end('404');
  }
}).listen(PORT, () => {
  console.log(`Arcade Java->JS rodando em http://localhost:${PORT}/arcade/`);
});
