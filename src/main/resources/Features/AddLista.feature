#language: pt
@adicionarLista
Funcionalidade: Adicionar Lista

  Contexto: 
    Dado que o usuario clique no botao nova Lista

  @Lista
  Esquema do Cenario: Criar Lista
    Quando preencher o campo a com  "<itema>"
    E preencher o campo b com  "<itemb>"
    E preencher o campo c com  "<itemc>"
    E preencher o campo Titulo da lista  "<titulo>"
    Entao o app salvara a lista automaticamente e a exibira na tela inicial

    Exemplos: 
      | itema | itemb | itemc | titulo          |
      | A     | B     | C     | Lista de Letras |
