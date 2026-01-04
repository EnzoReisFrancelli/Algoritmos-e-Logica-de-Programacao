Algoritmo "exercicio_senha_fixa"

Var

   senha : inteiro

Inicio
      
      repita
            escreva("Digite a senha :")
            leia(senha)
            
            se (senha <> 2002) entao
               escreval("Senha Inválida! Tente novamente")
            senao
                 escreval("Acesso Permitido")
            fimse
            
      ate (senha = 2002)

Fimalgoritmo