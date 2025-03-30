#include <locale.h>
#include <stdio.h>
#include <windows.h>

int main() {
setlocale(LC_ALL, "Portuguese_Brazil");
    SetConsoleCP(1252);       // Define a página de código para entrada
    SetConsoleOutputCP(1252); // Define a página de código para saída

    char op;
    float N1, N2;

    printf("Informe dois valores: ");
    scanf("%f %f", &N1, &N2);

    printf("Qual operacao? ");
    scanf(" %c", &op);

    if (op == '+') {
        printf("A soma de %.2f + %.2f = %.2f\n", N1, N2, N1 + N2);
    } else if (op == '-') {
        printf("A subtracao de %.2f - %.2f = %.2f\n", N1, N2, N1 - N2);
    } else if (op == 'x') {
        printf("A multiplicacao de %.2f * %.2f = %.2f\n", N1, N2, N1 * N2);
    } else {
        printf("A divisao de %.2f / %.2f = %.2f\n", N1, N2, N1 / N2);
    }

    printf("\n Parabéns pelo seu resultado !\n\n");


    return 0;

}




