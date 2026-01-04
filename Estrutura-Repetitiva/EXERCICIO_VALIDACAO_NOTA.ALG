Algoritmo "exercicio_validacao_nota"

Var

     n1, n2, media : real

Inicio
      
        escreva("Digite a nota da primeira prova : ")
        leia(n1)
        
        enquanto (n1 < 0) ou (n1 > 10) faca
                 escreval("Nota Inválida! Tente Novamente: ")
                 leia(n1)
        fimenquanto
        
        escreva("Digite a nota da segunda prova : ")
        leia(n2)

        enquanto (n2 < 0) ou (n2 > 10) faca
                 escreval("Nota Inválida! Tente Novamente: ")
                 leia(n2)
        fimenquanto

        
         media <- (n1 + n2) / 2
         escreval("MÉDIA = ", media:1:2)
        
        
Fimalgoritmo