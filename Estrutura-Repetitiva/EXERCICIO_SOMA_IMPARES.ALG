Algoritmo "exercicio_soma_impares"

Var

   i, X, Y, soma, troca : inteiro
   

Inicio

         escreva("Digite o primeiro número: ")
         leia(X)
         escreva("Digite o segundo número: ")
         leia(Y)
         
         se (x > y) entao
            troca <- X
            X <- Y
            Y <- troca
         fimse
         
         soma <- 0
         para i de X+1 ate Y-1 faca
                 se i mod 2 <> 0 entao
                    soma <- soma +i
                 fimse
         fimpara
         
         escreval("SOMA DOS ÍMPARES = ",soma)

Fimalgoritmo