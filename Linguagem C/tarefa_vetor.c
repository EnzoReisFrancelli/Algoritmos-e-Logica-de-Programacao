#include <stdio.h>

int main(){

    int i, N, soma;

    printf("Digite a quantidade de numeros que serao digitados: ");
    scanf("%d", &N);

    double vet[N];

    soma = 0;
    for (i = 0; i < N; i++){
        printf("Digite um numero: ");
        scanf("%lf", &vet[i]);
        soma = soma + vet[i];
    }

    printf("\nNumeros digitados:\n");
    for (i = 0; i < N; i++){
        printf("%.1lf\n", vet[i]);
    }

    printf("\nSOMA DOS NUMEROS DIGITADOS:\n");
    printf("%d", soma);

    return 0;

}


