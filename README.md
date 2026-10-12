# Portfolio

## Sobre esta coleção

Arquivo de projetos de estudo em Java, feitos em diferentes etapas da faculdade e do início da carreira. Há trabalhos concluídos, exercícios e protótipos; nem todos são projetos de produção.

## Arcade Java → JS

O arcade reúne arquivos Java únicos e aponta para conversões web disponíveis. O manifesto tem **376 arquivos**: **36 marcados como convertidos** e **340 na fila**. Esses números vêm de [`arcade/manifest.json`](arcade/manifest.json).

Alguns projetos maiores têm versões próprias:

| Projeto | Versão web |
|---|---|
| Jogo da Velha | [Abrir jogo](https://francoscorporation.github.io/jogo_da_velha_ia/) |
| Calculadora | [Abrir repositório](https://github.com/FrancosCorporation/calculadora) |
| Chat | [Abrir repositório](https://github.com/FrancosCorporation/chat_criptografado) |
| Analisador CSV | [Abrir repositório](https://github.com/FrancosCorporation/projeto_integrador_analisador_csv) |

O arcade já inclui **Abrir link** e **Conversor de bases**. O conversor reúne três classes Java do mesmo exercício e apresenta binário, octal, decimal e hexadecimal em uma interface web.

### Abrir o arcade localmente

Requer Node.js 22.12 ou superior. Na raiz deste repositório:

```bash
npm start
```

Abra o endereço mostrado no terminal (por padrão, `http://127.0.0.1:3000/`). O servidor local atende apenas a pasta `arcade/` e escuta somente no próprio computador.

No catálogo, pesquise por nome, categoria ou caminho; filtre por convertidos ou itens na fila; abra uma versão web quando houver link ou consulte o arquivo Java original no GitHub. Use `npm run check` para validar a sintaxe dos arquivos JavaScript do arcade.

As conversões devem seguir a ordem e as categorias de `arcade/manifest.json`. Só marque um item como convertido quando existir uma implementação web correspondente e um link funcional. A suíte de testes automatizados ainda precisa ser criada.
