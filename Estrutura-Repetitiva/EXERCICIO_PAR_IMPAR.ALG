Algoritmo "exercicio_par_impar"

Var

     n, i, x : inteiro

Inicio

      escreva("Quantos números você deseja digitar? ")
      leia(n)
      
      para i de 1 ate n faca
             escreva("Digite um número: ")
             leia(x)
             
             se x = 0 entao
                escreval("NULO")
             senao
                  se x mod 2 = 0 entao
                       se x > 0 entao
                          escreval("PAR POSITIVO")
                       senao
                            escreval("PAR NEGATIVO")
                       fimse
                  senao
                       se x > 0 entao
                          escreval("ÍMPAR POSITIVO")
                       senao
                            escreval("ÍMPAR NEGATIVO")
                       fimse
                  fimse
             fimse
        fimpara

Fimalgoritmo