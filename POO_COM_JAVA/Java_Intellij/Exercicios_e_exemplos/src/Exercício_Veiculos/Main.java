//--------------------------Main de veiculos-----------------------------------
//public class Main {
//    public static void main(String[] args) {
//        // Criando um veículo genérico
//        Veiculo v1 = new Veiculo("ABC1234", 2010, 1);
//        System.out.println("Detalhes do Veículo:");
//        v1.exibirDetalhes();
//
//        System.out.println("----------------------");
//
//        // Criando um carro que herda de Veiculo
//        Carro c1 = new Carro("XYZ9876", 2022, 2, "SUV");
//        System.out.println("Detalhes do Carro:");
//        c1.exibirDetalhes();
//}
//}
//--------------------------Main de Conta-----------------------------------
//public class Main {
//    public static void main(String[] args) {
//        Conta conta = new Conta("Fulano", 100.00, 123);
//
//        System.out.printf("Saldo inicial: R$ %.2f%n", conta.getSaldo());
//
//        // Depósito simples
//        boolean d1 = conta.depositar(250.00);
//        System.out.println("Depósito simples: " + (d1 ? "ok" : "falhou"));
//        System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
//
//        // Depósito com origem
//        boolean d2 = conta.depositar(75.50, "PIX do cliente");
//        System.out.println("Depósito com origem: " + (d2 ? "ok" : "falhou"));
//        System.out.printf("Saldo final: R$ %.2f%n", conta.getSaldo());
//}
//}

//--------------------------------Main Instrumentos--------------------------------
//public class Main {
//
//    public static void main(String[] args) {
//        // Instanciando um instrumento:
//        Instrumento instrumento1 = new Instrumento("Violão Giannini", 2008, "Cordas");
//        instrumento1.tocar(); // Saída esperada: Tocando o instrumento: Violão Giannini (Cordas), fabricado em 2008.
//
//        // Instanciando o saxofone:
//        Saxofone sax = new Saxofone("Sax Tenor Selmer", 2012, "Sopro", "Si bemol");
//        sax.tocar(); // Saída esperada: 🎷 Tocando o saxofone
//    }
//}

//-----------------------------------Números Ímpares e Pares--------------------------------------------
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int pares = 0;      // Contador de números pares
//        int impares = 0;    // Contador de números ímpares
//
//        System.out.println("=== EXERCÍCIO 1 - NÚMEROS PARES E ÍMPARES ===");
//        System.out.println("Digite 10 números inteiros:");
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.print("Número " + i + ": ");
//            int numero = scanner.nextInt();  // Lê o número digitado
//
//            if (numero % 2 == 0) {
//                pares++;        // Conta os pares
//            } else {
//                impares++;      // Conta os ímpares
//            }
//        }
//
//        System.out.println("\n--- RESULTADO ---");
//        System.out.println("Números pares: " + pares);
//        System.out.println("Números ímpares: " + impares);
//
//        scanner.close();
//    }
//}

//------------------------Tabuada------------------------------
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("\n=== EXERCÍCIO 2 - TABUADA PERSONALIZADA ===");
//        System.out.print("Digite um número para ver sua tabuada: ");
//        int numeroEscolhido = scanner.nextInt();
//
//        System.out.println("\nTabuada do " + numeroEscolhido + ":");
//        for (int i = 1; i <= 10; i++) {
//            int resultado = numeroEscolhido * i;
//            System.out.println(numeroEscolhido + " x " + i + " = " + resultado);
//        }
//    }
//
//}

//-------------------------Somatório e Média----------------------

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("\n=== EXERCÍCIO 3 - SOMATÓRIO E MÉDIA ===");
//        System.out.print("Quantos números você deseja digitar? ");
//        int qtdVezes = scanner.nextInt();
//
//        if (qtdVezes <= 0) {
//            System.out.println("Quantidade deve ser maior que zero!");
//            return;
//        }
//
//        int soma = 0;
//        System.out.println("Digite os " + qtdVezes + " números:");
//
//        for (int i = 1; i <= qtdVezes; i++) {
//            System.out.print("Número " + i + ": ");
//            int numero = scanner.nextInt();
//            soma += numero;
//        }
//
//        double media = (double) soma / qtdVezes;
//
//        System.out.println("\nResultados:");
//        System.out.println("Soma: " + soma);
//        System.out.printf("Média: %.2f%n", media);
//    }
//}

//------------------ Contagem de vogais-------------------------------

//OBS: 📝 1. .toLowerCase() -O que faz:
//Converte TODA a string para letras minúsculas
//Exemplo: "HELLO World" → "hello world"
//Por que usar:
//Para facilitar a comparação das vogais
//Sem ele, você teria que verificar: 'a', 'A', 'e', 'E', 'i', 'I'...
//Com ele, só precisa verificar: 'a', 'e', 'i', 'o', 'u'
//🔤 2. .charAt(i)
//javachar letra = texto.charAt(i) - O que faz:
//Pega um caractere específico da string na posição i
//Exemplo: "hello".charAt(1) → retorna 'e'
// Como funciona:
//String é como um array de caracteres
//Posições começam em 0:
//  "hello"01234  ← posições
//🔄 Como trabalham juntos no código:
//javaString texto = "AEIOU".toLowerCase();  // → "aeiou"
//
//for (int i = 0; i < texto.length(); i++) {
//    char letra = texto.charAt(i);      // Pega cada letra: 'a', 'e', 'i', 'o', 'u'
//
//    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
//        vogais++;  // Conta as vogais
//    }
//}
//💡 Fluxo completo:
//
//Usuário digita: "Olá Mundo"
//.toLowerCase(): "olá mundo"
//Loop percorre cada posição:
//
//charAt(0) → 'o' → é vogal ✓
//charAt(1) → 'l' → não é vogal
//charAt(2) → 'á' → é vogal ✓
//...e assim por diante
//
//
//
//Essas funções tornam o código mais simples e eficiente para contar vogais em qualquer texto.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== EXERCÍCIO 4 - CONTAGEM DE VOGAIS ===");
        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().toLowerCase();

        int vogais = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vogais++;
            }
        }

        System.out.println("Número de vogais encontradas: " + vogais);
    }
}




