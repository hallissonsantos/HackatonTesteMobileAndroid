#language: pt
@adicionar
Funcionalidade: Adicionar Notas

  Contexto: 
    Dado que o usuario clique no botao de adicionar

  @NotaSimples
  Esquema do Cenario: Adicionar Nota Simples
    Quando preencher o campo titulo com "<titulo>"
    E preencher o campo "<nota>"
    Entao o app salvara a nota automaticamente e a exibira na tela inicial

    Exemplos: 
      | titulo      | nota           |
      | nota titulo | nota descricao |

  @NotaColorida
  Esquema do Cenario: Adicionar Nota Colorida
    Quando preencher o campo titulo com "<titulo>"
  
    E clicar no botao de opcoes
    E escolher a cor da nota
    Entao o app salvara a nota automaticamente e a exibira anota colorida na tela inicial

    Exemplos: 
      | titulo        | 
      | nota colorida | 

  @NotaComAlarme
  Esquema do Cenario: Adicionar Nota com Alarme
    Quando preencher o campo titulo com "<titulo>"
    E preencher o campo "<nota>"
    E clicar no botao de Alarme
    E escolher o primeiro alarme
    Entao o app salvara a nota automaticamente e a com o lembrete Do Alarme selecionado

    Exemplos: 
      | titulo | nota               |
      | Alarme | lembrar de estudar |
