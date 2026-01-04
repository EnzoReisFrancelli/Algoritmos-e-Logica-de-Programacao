Algoritmo "exercicio_divisao"

Var

    n, i : inteiro
    divisao, x1, x2 : real

Inicio

      escreva("Quantos casos você vai digitar? ")
      leia(n)
      
      para i de 1 ate n faca
             escreva("Entre com o numerador: ")
             leia(x1)
             escreva("Entre com o denominador: ")
             leia(x2)
             
             se x2 = 0 entao
                escreva("DIVISÃO IMPOSSÍVEL")
             senao
                  divisao <- x1 / x2
                  escreval("DIVISÃO = ", divisao)
             fimse
      fimpara

Fimalgoritmo