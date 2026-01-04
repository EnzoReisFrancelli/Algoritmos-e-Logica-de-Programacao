Algoritmo "exercicio_experiencia"

Var

   n, i, quantCobaia, totalCobaias, totalCoelhos, totalSapos, totalRatos : inteiro
   pctRatos, pctCoelhos, pctSapos : real
   tpCobaia : caractere

Inicio

     totalRatos <- 0
     totalSapos <- 0
     totalCoelhos <- 0
     
     escreva("Quantos casos de teste serão digitados? ")
     leia(n)

     para i de 1 ate n faca
            escreva("Quantidade de cobais: ")
            leia(quantCobaia)
            escreva("Tipo de cobais: ")
            leia(tpCobaia)
            
            se tpCobaia = "R" entao
               totalRatos <- totalRatos + quantCobaia
            senao
                 se tpCobaia = "S" entao
                     totalSapos <- totalSapos + quantCobaia
                 senao
                      se tpCobaia = "C" entao
                         totalCoelhos <- totalCoelhos + quantCobaia
                      fimse
                 fimse
            fimse
     fimpara
     
     totalCobaias <- totalRatos + totalSapos + totalCoelhos
     pctRatos <- totalRatos / totalCobaias * 100
     pctSapos <- totalSapos / totalCobaias * 100
     pctCoelhos <- totalCoelhos / totalCobaias * 100
     
     escreval
     
     escreval("RELATÓRIO FINAL: ")
     escreval
     escreval("Total de Cobaias = ",totalCobaias)
     escreval("Total de Ratos = ",totalRatos)
     escreval("Total de Sapos = ",totalSapos)
     escreval("Total de Coelhos = ",totalCoelhos)
     escreval("Percentual de Ratos = ",pctRatos:2:2)
     escreval("Percentual de Sapos = ",pctSapos:2:2)
     escreval("Percentual de Coelhos = ",pctCoelhos:2:2)

Fimalgoritmo