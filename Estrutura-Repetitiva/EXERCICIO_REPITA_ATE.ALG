Algoritmo "exercicio_repita_ate"

Var

   resp : caractere
   C, F : real
   
   

Inicio
      
      repita
            escreva("Digite a temperatura em Celsius :")
            leia(C)

            F <- (9 * C) / 5 + 32

            escreval("Temperatura equivalente em Fahrenheit :" ,F:3:1)

            escreva("Deseja repetir (s/n)? ")
            leia(resp)
      ate (resp <> "s")

Fimalgoritmo