# Melhorias do Portfolio e do arcade

## Escopo observado

- `README.md:5` descreve uma coleção de estudos com protótipos, e `README.md:9` registra o catálogo com 376 arquivos Java: 36 marcados como convertidos e 340 na fila.
- `arcade/menu.js:63,120,167` monta cards com DOM seguro, links para versões e caminhos do código-fonte.
- `server.js:7,18,38,89` limita o preview local à pasta do arcade, restringe o acesso ao próprio computador e aplica cabeçalhos de segurança.

## Itens

- [x] **SEC-01 (P1) — Restringir o servidor local.** `server.js:7,18,38,89`. O preview servia a raiz inteira do arquivo e podia escutar em interfaces de rede. Agora serve apenas `arcade/`, valida caminhos reais, aceita somente GET/HEAD, usa cabeçalhos de segurança e escuta em `127.0.0.1`.
- [x] **IMP-01 (P1) — Tornar o catálogo navegável e seguro.** `arcade/index.html:23`, `arcade/menu.js:38,120,167` e `arcade/style.css:1`. Adicionei busca sem acento, filtro por estado, contagem dos resultados, estados de erro/vazio, layout responsivo e foco visível. Os cards usam texto via DOM em vez de interpolação HTML; cada item aponta para a fonte Java e, quando disponível, para a versão convertida.
- [x] **IMP-02 (P1) — Converter o próximo conjunto da fila.** `arcade/apps/abrir-link/app.js:5,29,41` implementa a conversão web das classes `NovaAba` e `webBrowser`, cadastradas em `arcade/manifest.json:210,217`. A nova página valida URLs HTTP/HTTPS e abre somente após ação explícita; remove a abertura repetida em segundo plano do código Java original (`Projetos-Pessoais_Comeco_da_Carreira/Java/Em Desenvolvimeto/Abrindo Link/src/Padrao/NovaAba.java:61`).
- [x] **DOC-01 (P2) — Corrigir o README e os números do catálogo.** `README.md:5,9,22`. Removi a afirmação de que todos os projetos estão concluídos, corrigi o inventário e documentei como iniciar e navegar pelo arcade.
- [x] **DEVOPS-01 (P2) — Evitar lixo de desenvolvimento no Git.** `.gitignore:1,2,3`. Ignorei caches Python e dependências locais; removi três bytecodes Python rastreados, que têm fontes `.py` correspondentes.
- [x] **DEVOPS-02 (P2) — Oferecer verificação estática real.** `package.json:9`. Removi a referência a `test/arcade-test.mjs`, arquivo inexistente, e adicionei `npm run check` para validar a sintaxe dos scripts do servidor e do arcade.
- [x] **SEC-02 (P1) — Atualizar o app web NLW.** `Projetos-Pessoais_Comeco_da_Carreira/Js/nlw/web/package.json:5,8,11,30` e `package-lock.json:1`. O Dependabot reportava 186 alertas abertos no `yarn.lock` do Create React App 3.4.3. Migrei para Vite 8, React 19.3, React Router 7 e React Leaflet 5; substituí Yarn por npm e `npm audit --audit-level=high` retorna zero.
- [x] **UX-01 (P1) — Corrigir o mapa e os estados sem dados.** `Projetos-Pessoais_Comeco_da_Carreira/Js/nlw/web/src/pages/OrphanagesMaps.tsx:21,40,47`, `src/config.ts:1` e `Projetos-Pessoais_Comeco_da_Carreira/Js/nlw/web/.env.example:1`. Removi o token Mapbox ausente e o botão sem ação; o mapa OpenStreetMap agora mostra atribuição e informa que ainda não há instituições cadastradas. A URL da camada pode ser alterada por ambiente.
- [x] **UX-02 (P2) — Atualizar a apresentação do app NLW.** `Projetos-Pessoais_Comeco_da_Carreira/Js/nlw/web/src/pages/landing.tsx:7` e `Projetos-Pessoais_Comeco_da_Carreira/Js/nlw/web/src/styles/pages/landing.css:1`. Corrigi o nome do estado e o texto, organizei o fluxo de navegação e adaptei a página a telas pequenas.
- [x] **DOC-02 (P2) — Documentar o app NLW atualizado.** `Projetos-Pessoais_Comeco_da_Carreira/Js/nlw/web/README.md:1,10,24,29`. Registrei requisitos, comandos, rotas, uso dos tiles e a ausência atual de API/dados.
- [ ] **SEC-03 (P1) — Remover suporte declarado a runtimes Node.js EOL.** `package.json`, `README.md` e o pacote NLW ainda aceitavam Node 18/20; atualizar para Node 22.12+, linha usada pelo app e compatível com Vite 8.
- [ ] **DEVOPS-03 (P2) — Adicionar CI estática sem executar testes.** Validar sintaxe do catálogo, instalar/auditar dependências do app NLW, typecheck e build em Node 22/24.
- [ ] **IMP-04 (P2) — Converter o exercício Conversor de Bases.** `arcade/manifest.json` deve apontar as classes `NewFrontEnd`, `Logica_1` e `Teste` para uma interface web acessível que preserve as conversões com limite de inteiro de 32 bits.
- [ ] **TEST-01 (P1) — Criar testes automatizados.** `README.md:34`. Ainda não existe uma suíte de testes; o comando de teste quebrado foi removido. A verificação atual cobre sintaxe, não comportamento no navegador.
- [ ] **IMP-03 (P2) — Continuar a conversão do catálogo.** `arcade/manifest.json:3,4`. Nesta etapa, as três classes do Conversor de Bases compartilharão uma implementação web; a fila ficará com 340 arquivos.

## Verificações desta rodada

- `npm run check`
- Parse estático de `arcade/manifest.json`
- No app NLW: `npm ci`, `npm audit --audit-level=high`, `npm run check` e `npm run build`
- CI estática Node 22/24: sintaxe, audit, typecheck e build; sem testes
- `git diff --check`

Não executei testes, navegador ou servidor local.
