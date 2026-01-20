#include <stdio.h>

int main(){

 int v1, v2;

 printf("Digite o primeiro numero: ");
 scanf("%d", &v1);
 printf("Digite o segundo numero: ");
 scanf("%d", &v2);

 if(v1 < v2){
    printf("\nCRESCENTE!\n");
 }else if(v1 > v2){
    printf("\nDECRESCENTE!\n");
 }else{
    printf("\nVALORES IGUAIS!\n");
 }

 return 0;
}
