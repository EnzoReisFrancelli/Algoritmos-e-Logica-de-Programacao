#include <stdio.h>

void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    double C,F;
    char resp;

    do{
    printf("Digite um temperatura em Celsius: ");
    scanf("%lf", &C);

    F = (C * 9)/ 5 + 32;
    printf("A temperatura equivalente em Fahrenheit e: %.1lf\n", F);

    printf("Deseja repetir (s/n)? ");
    limpar_entrada();
    scanf("%c", &resp);

    }while (resp == 's');

    return 0;

}
