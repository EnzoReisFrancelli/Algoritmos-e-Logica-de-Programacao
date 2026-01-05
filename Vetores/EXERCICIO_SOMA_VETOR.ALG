Algoritmo "exercicio_soma_vetor"

Var

     soma, media : real
     i, n : inteiro
     vet : vetor [0..9] de real

Inicio

      escreva("Quantos números você vai digitar? ")
      leia(n)
      
      soma <- 0
      para i de 0 ate n-1 faca
             escreva("Digite um número: ")
             leia(vet[i])
             soma <- soma + vet[i]
      fimpara
      
      escreval
      
       para i de 0 ate n-1 faca
             escreval("VALORES : ",vet[i])
      fimpara
      
      escreval
      
      media <- soma / n
      escreval("SOMA = ", soma:2:2)
      escreval("MÉDIA = ",media:2:2)
      
      
Fimalgoritmo