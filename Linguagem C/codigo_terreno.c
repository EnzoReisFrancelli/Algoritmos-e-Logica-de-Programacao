#include <stdio.h>

int main(){

    double largura, comprimento, area, metroQ, preco;

    printf("Digite a largura do terreno: ");
    scanf("%lf", &largura);
    printf("Digite o comprimento do terreno: ");
    scanf("%lf", &comprimento);
    printf("Digite o metro quadrado do terreno: ");
    scanf("%lf", &metroQ);

    area = largura * comprimento;
    preco = area * metroQ;

    printf("\nAREA = %.2lf\n", area);
    printf("\nVALOR DO TERRENO = %.2lf\n", preco);

    return 0;

}
