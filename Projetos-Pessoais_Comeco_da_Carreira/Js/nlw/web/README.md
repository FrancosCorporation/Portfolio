# Happy

Aplicação web de estudo para ajudar pessoas a conhecer instituições que recebem visitas. A interface atual oferece uma página inicial e um mapa de Inhumas, Goiás.

## Requisitos

- Node.js 22.12 ou superior
- npm

## Executar localmente

```bash
npm install
npm run dev
```

O Vite informa o endereço local no terminal. Para validar os tipos e gerar a versão de produção:

```bash
npm run check
npm run build
```

## Rotas

- `/` — apresentação do projeto e acesso ao mapa
- `/app` — mapa interativo de Inhumas

O repositório ainda não possui API ou cadastro de instituições. Por isso, o mapa informa quando nenhum local está cadastrado em vez de exibir dados de exemplo.

O mapa usa os tiles públicos do OpenStreetMap com atribuição visível. A camada é carregada conforme a área visualizada; não use pré-carregamento ou download em lote. Consulte a [política de uso dos tiles](https://operations.osmfoundation.org/policies/tiles/). Para trocar a camada, configure `VITE_MAP_TILE_URL` (veja `.env.example`) e ajuste a atribuição conforme o provedor.
