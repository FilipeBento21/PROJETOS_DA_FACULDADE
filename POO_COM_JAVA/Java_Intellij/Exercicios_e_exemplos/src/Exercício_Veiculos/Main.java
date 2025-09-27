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


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0;      // Contador de números pares
        int impares = 0;    // Contador de números ímpares

        System.out.println("=== EXERCÍCIO 1 - NÚMEROS PARES E ÍMPARES ===");
        System.out.println("Digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();  // Lê o número digitado

            if (numero % 2 == 0) {
                pares++;        // Conta os pares
            } else {
                impares++;      // Conta os ímpares
            }
        }

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);

        scanner.close();
    }
}
