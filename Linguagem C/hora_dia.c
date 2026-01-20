#include <stdio.h>

int main() {
    int hora;

    printf("Digite a hora do dia (0-23): ");
    scanf("%d", &hora);

    if (hora >= 0 && hora < 12) {
        printf("BOM DIA!\n");
    } else if (hora >= 12 && hora < 18) {
        printf("BOA TARDE!\n");
    } else if (hora >= 18 && hora <= 23) {
        printf("BOA NOITE!\n");
    } else {
        printf("DADO INEXISTENTE! Hora deve estar entre 0 e 23.\n");
    }

    return 0;
}
