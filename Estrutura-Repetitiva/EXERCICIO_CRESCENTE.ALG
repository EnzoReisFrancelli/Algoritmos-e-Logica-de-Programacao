Algoritmo "exercicio_crescente"

Var

      x, y : inteiro

Inicio

      escreval("Digite dois números: ")
      leia(x)
      leia(y)
      
      enquanto (x <> y) faca
                se (x > y) entao
         escreval("DECRESCENTE")
      senao
           se (y > x) entao
           escreval("CRESCENTE")
           fimse
      fimse
           escreva("Digite outros dois números: ")
           leia(x)
           leia(y)
      fimenquanto
      

Fimalgoritmo