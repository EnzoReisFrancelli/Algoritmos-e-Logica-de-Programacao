Algoritmo "exercicio_alturas"

Var

    n, i, cont : inteiro
    idade : vetor [0..9] de inteiro
    nome : vetor [0..9] de caractere
    altura : vetor [0..9] de real
    soma, media, pct : real

Inicio

      escreva("Quantas pessoas serão digitadas? ")
      leia(n)
      
      para i de 0 ate n-1 faca
             escreval("Dados da ", i+1, "a pessoa:")
             escreva("Nome: ")
             leia(nome[i])
             escreva("Idade: ")
             leia(idade[i])
             escreva("Altura: ")
             leia(altura[i])
      fimpara
      
      soma <- 0
      para i de 0 ate n-1 faca
             soma<- soma + alturas[i]
      fimpara
      
      media <- soma / n
      escreval
      escreva("ALTURA MÉDIA = ",media:4:2)
      
      cont <- 0
      para i de 0 ate n-1 faca
             se idade[i] < 16 entao
                  cont <- cont + 1
             fimse
      fimpara
      
      pct <- cont * 100 / n
      escreval("Peossoas com menos de 16 anos :", pct:3:1, "%")
      
      escreval
      
      para i de 0 ate n-1 faca
             se idade[i] < 16 entao
                  escreval(nome[i])
             fimse
      fimpara
      
      
Fimalgoritmo