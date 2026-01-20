#include <stdio.h>

int main(){

    int x, N, i, soma;

    printf("Digite a quantidade de números: ");
    scanf("%d", &N);

    soma = 0;
    for(i = 1; i <= N; i++){
        printf("Digite um número: ");
        scanf("%d", &x);
        soma = soma + x;
    }

    printf("SOMA = %d\n", soma);
    return 0;

}
