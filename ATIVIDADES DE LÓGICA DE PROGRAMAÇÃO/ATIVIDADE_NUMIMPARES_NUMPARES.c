#include <stdio.h>

int main() {
    int numero, pares = 0, impares = 0, totalNumeros = 0;
    float somaPares = 0, somaGeral = 0;

    printf("Digite números (0 para encerrar):\n");

    do {
        scanf("%d", &numero);

        if (numero != 0) {
            totalNumeros++;
            somaGeral += numero; 

            if (numero % 2 == 0) {
                pares++;
                somaPares += numero;
            } else {
                impares++;
            }
        }
    } while (numero != 0);

    printf("Quantidade de números pares: %d\n", pares);
    printf("Quantidade de números ímpares: %d\n", impares);

    if (pares > 0) {
        printf("Média dos valores pares: %.2f\n", somaPares / pares);
    }

    if (totalNumeros > 0) {
        printf("Média geral: %.2f\n", somaGeral / totalNumeros);
    }

    return 0;
}