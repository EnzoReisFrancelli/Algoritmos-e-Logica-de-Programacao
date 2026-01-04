Algoritmo "exercicio_dentro_fora"

Var

   x, n, i, dentro, fora : inteiro

Inicio

      dentro <- 0
      fora <- 0
      
      escreva("Digite quantos números vc vai escrever :")
      leia(n)
      
      para i de 1 ate n faca
           escreva("Digite um número :")
           leia(x)
           
           se (x >= 10) e (x <= 20) entao
                 dentro <- dentro + 1
           senao
                 fora <- fora + 1
           fimse
      fimpara
     
      escreval(dentro:2, " DENTRO")
      escreval(fora:2, " FORA")

Fimalgoritmo