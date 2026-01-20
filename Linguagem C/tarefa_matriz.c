#include <stdio.h>

int main(){

    int i,j,M,N;

    printf("Digite quantas linhas vai ter a matriz: ");
    scanf("%d", &N);
    printf("Digite quantas colunas vai ter a matriz: ");
    scanf("%d", &M);

    int matriz[N][M];

    for(i=0; i<N; i++){
        for (j=0; j<M; j++){
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d, &matriz[i][j]");
        }
    }

    printf("\nMATRIZ DIGITADA:\n");
    for(i=0; i<N; i++){
        for(j=0;j<M; j++){
            printf("%d", &matriz[i][j]);
        }
        printf("\n");
    }

    return 0;

}
