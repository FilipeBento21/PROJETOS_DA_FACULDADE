
//1. Calcular dias de vida com nome e idade:
/*
#include <stdio.h>

int main() {
    char nome[50];
    int idade;
    int dias;

    printf("Digite seu nome: ");
    scanf("%s", nome);

    do {
        printf("Digite sua idade (em anos): ");
        scanf("%d", &idade);
    } while (idade <= 0);

    dias = idade * 365;
    printf("%s, VOCÊ JÁ VIVEU %d DIAS.\n", nome, dias);

    return 0;
}
*/

//2. Verifica sexo, estado civil e anos casada:

/*
#include <stdio.h>

int main() {
    char nome[100], sexo, estado_civil[10];
    int anosCasada;

    printf("Digite o nome: ");
    scanf("%s", nome);

    printf("Digite o sexo (M/F): ");
    scanf(" %c", &sexo);

    printf("Digite o estado civil: ");
    scanf("%s", estado_civil);

    if (sexo == 'F' || sexo == 'f') {
        if (strcmp(estado_civil, "CASADA") == 0) {
            printf("Quantos anos está casada? ");
            scanf("%d", &anosCasada);
            printf("%s está casada há %d anos.\n", nome, anosCasada);
        }
    }

    return 0;
}
*/

//4. Maior e menor altura de 15 pessoas:
/*
#include <stdio.h>

int main() {
    float altura, maior = 0, menor = 999;
    int i;

    for (i = 1; i <= 15; i++) {
        printf("Digite a altura da pessoa %d (em metros): ", i);
        scanf("%f", &altura);

        if (altura > maior) {
            maior = altura;
        }
        if (altura < menor) {
            menor = altura;
        }
    }

    printf("A menor altura é: %.2f m\n", menor);
    printf("A maior altura é: %.2f m\n", maior);

    return 0;
}
*/

//5. Leitura de números até zero + estatísticas:

#include <stdio.h>
/*
int main() {
    int numero, soma = 0, qtd = 0, pares = 0, impares = 0;
    float media;

    do {
        printf("Digite um número positivo (0 para encerrar): ");
        scanf("%d", &numero);

        if (numero > 0) {
            soma += numero;
            qtd++;

            if (numero % 2 == 0)
                pares++;
            else
                impares++;
        }

    } while (numero != 0);

    if (qtd > 0) {
        media = (float)soma / qtd;
        printf("Total de números lidos: %d\n", qtd);
        printf("Quantidade de pares: %d\n", pares);
        printf("Quantidade de ímpares: %d\n", impares);
        printf("Média geral: %.2f\n", media);
    } else {
        printf("Nenhum número válido foi informado.\n");
    }

    return 0;
}
*/

//6. Fatorial com sequência:

#include <stdio.h>

int main() {
    int a, i;
    unsigned long long fatorial = 1;

    printf("Digite um valor para calcular o fatorial: ");
    scanf("%d", &a);

    printf("%d! = ", a);
    for (i = a; i >= 1; i--) {
        fatorial *= i;
        printf("%d", i);
        if (i > 1)
            printf(" x ");
    }

    printf(" = %llu\n", fatorial);

    return 0;
}
