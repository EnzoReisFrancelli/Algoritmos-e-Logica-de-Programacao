#include <stdio.h>

int main(){

   int v1, v2, v3;

   printf("Primeiro valor: ");
   scanf("%d", &v1);
   printf("Segundo valor: ");
   scanf("%d", &v2);
   printf("Terceiro valor: ");
   scanf("%d", &v3);

   if(v1 <= v2 && v1 <= v3){
    printf("\nMENOR VALOR = %d\n", v1);
   }else if(v2 <= v1 && v2 <= v3){
    printf("\nMENOR VALOR = %d\n", v2);
   }else if(v3 <= v1 && v3 <= v2){
    printf("\nMENOR VALOR = %d\n", v3);
   }

    return 0;
}
