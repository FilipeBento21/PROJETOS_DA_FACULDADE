#include <locale.h>
#include <stdio.h>
#include <windows.h>

int main() {
setlocale(LC_ALL, "Portuguese_Brazil");
    SetConsoleCP(1252);       // Define a página de código para entrada
    SetConsoleOutputCP(1252); // Define a página de código para saída

    char op;
    float N1, N2, resultado;

    printf("Informe dois valores: ");
    scanf("%f %f", &N1, &N2);

    printf("Qual operacao? ");
    scanf(" %c", &op);

    if (op == '+') {
        resultado = N1 + N2;
        printf("A soma de %.2f + %.2f = %.2f\n", N1, N2, resultado);
    } else if (op == '-') {
        resultado = N1 - N2;
        printf("A subtracao de %.2f - %.2f = %.2f\n", N1, N2, resultado);
    } else if (op == 'x') {
        resultado = N1 * N2;
        printf("A multiplicacao de %.2f * %.2f = %.2f\n", N1, N2, resultado);
    } else if (op == '/') {
        if (N2 != 0) {
        resultado = N1 / N2;
        printf("A divisao de %.2f / %.2f = %.2f\n", N1, N2, resultado);
        } else {
        printf("\nnão é possível fazer divisão por zero, favor digitar outro número !\n");
        } 
    }else {
        printf("\nOperação Invalida. Tente novamente.\n");
    }


    printf("\n Parabéns pelo seu resultado !\n\n");


    return 0;

}




