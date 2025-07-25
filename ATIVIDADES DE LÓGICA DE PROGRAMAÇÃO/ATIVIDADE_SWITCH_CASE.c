#include <stdio.h>

int main() {
    int diaDaSemana;

    printf("Digite o número do dia da semana (de 1 a 7): ");
    scanf("%d", &diaDaSemana);

    switch(diaDaSemana) {
        case 1:
            printf("O Primeiro dia da semana é Domingo\n");
            break;
        case 2:
            printf("O Segundo dia da semana é Segunda-feira\n");
            break;
        case 3:
            printf("O Terceiro dia da semana é Terça-feira\n");
            break;
        case 4:
            printf("O Quarto dia da semana é Quarta-feira\n");
            break;
        case 5:
            printf("O Quinto dia da semana é Quinta-feira\n");
            break;
        case 6:
            printf("O Sexto dia da semana é Sexta-feira\n");
            break;
        case 7:
            printf("O Sétimo dia da semana é Sábado\n");
            break;
        default:
            printf("Valor inválido. Por favor, insira um número de 1 a 7.\n");
    }

    return 0;
}