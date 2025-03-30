#include <stdio.h>

int main() {
    char op;
    float N1, N2;

    printf("Informe dois valores: ");
    scanf("%f %f", &N1, &N2);

    printf("Qual operacao? ");
    scanf(" %c", &op);

    if (op == '+') {
        printf("A soma de %.2f + %.2f = %.2f", N1, N2, N1 + N2);
    } else if (op == '-') {
        printf("A subtracao de %.2f - %.2f = %.2f", N1, N2, N1 - N2);
    } else if (op == '*') {
        printf("A multiplicacao de %.2f * %.2f = %.2f", N1, N2, N1 * N2);
    } else {
        printf("A divisao de %.2f / %.2f = %.2f", N1, N2, N1 / N2);
    }

    printf("Feliz pelo seu resultado, até a próxima !");

    return 0;

}




