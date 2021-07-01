# typesafebuilder-subway-exemplo

<p align="center">
  <img src="https://media.giphy.com/media/3wHX8OkLZUyKA/giphy.gif"/>
</p>

Projeto criado de base para o post sobre typesafe-builders.

O projeto está dividido em 3 refatorações principais que chegamos no artigo.

## 1 - Refatoração

- Criamos um builder padrão.
- Alteramos o construtor para privado.
- Disponibilizamos um método de criação(static factory).


## 2 - Refatoração

- Substituimos o builder pelo novo Type-safe builder.

Obs: Nosso builder é inacessivel fora do pacote, pois, não definimos nenhuma visibilidade em nossas classes internas de lanche.

## 3 - Refatoração

- Criamos as interfaces como publicas para disponibilizar as classes internas de lanche
- Restringimos ainda mais o acesso a nossas classes internas à Lanche com a implementação das interfaces.
- Agora o nosso builder pode ser acessado de qualquer lugar, utilizando uma API fluente.
