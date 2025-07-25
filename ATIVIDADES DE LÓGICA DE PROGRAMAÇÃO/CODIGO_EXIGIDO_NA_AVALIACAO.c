#include <stdio.h>

// Função que retorna a área de um retângulo
int calcularAreaRetangulo(int comp, int largura){
    return comp * largura;
}

// Função que retorna a área de um triângulo
int calcularAreaTriangulo(int base, int altura){
    return (base * altura) / 2;
}

// Procedimento que imprime a área de um círculo
void calcularAreaCirculo(int raio){
    float area = 3.14 * (raio * raio);
    printf("A área do círculo é: %.2f\n", area);
}

// Procedimento que imprime a área de um quadrado 
void calcularAreaQuadrado(int lado){
    int area = lado * lado;
    printf("A área do quadrado é: %d\n", area);
}

int main(){
    int opcao;
    int a, b, resultado;

    do {
        // Exibir menu
        printf("\n===== MENU DE ÁREAS =====\n");
        printf("[1] - Retângulo\n");
        printf("[2] - Triângulo\n");
        printf("[3] - Círculo\n");
        printf("[4] - Quadrado\n");
        printf("[0] - Sair\n");
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);

        switch (opcao){
            case 1:
                printf("Você escolheu Retângulo!\n");
                printf("Informe base e altura: ");
                scanf("%d %d", &a, &b);
                resultado = calcularAreaRetangulo(a, b);
                printf("A área do retângulo é: %d\n", resultado);
                break;
            case 2:
                printf("Você escolheu Triângulo!\n");
                printf("Informe base e altura: ");
                scanf("%d %d", &a, &b);
                resultado = calcularAreaTriangulo(a, b);
                printf("A área do triângulo é: %d\n", resultado);
                break;
            case 3:
                printf("Você escolheu Círculo!\n");
                printf("Informe o raio: ");
                scanf("%d", &a);
                calcularAreaCirculo(a);
                break;
            case 4:
                printf("Você escolheu Quadrado!\n");
                printf("Informe o lado: ");
                scanf("%d", &a);
                calcularAreaQuadrado(a);
                break;
            case 0:
                printf("Encerrando o programa...\n");
                break;
            default:
                printf("Opção inválida! Tente novamente.\n");
        }

    } while (opcao != 0);

    return 0;
}