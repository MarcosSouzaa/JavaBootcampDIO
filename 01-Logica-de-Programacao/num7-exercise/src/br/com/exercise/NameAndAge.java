package br.com.exercise;

import java.util.Scanner;

/*
* Escreva um código que receba  o nome e a idade de duas pessoas e imprima a
* diferença de idade entre elas.
*/
public class NameAndAge {
    public static void main(String[] args) {
        // Inicializa o objeto Scanner para receber a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Dados da Primeira Pessoa ---");
        System.out.println("Digite o nome da primeira pessoa: ");
        // O nextLine() lê a linha completa (incluindo espaços)
        var name1 = scanner.nextLine();

        System.out.print("Digite a idade: ");
        var age1 = scanner.nextInt();
        /*  Se não fizermos o nextLine() abaixo, o próximo nextLine() (para nome2)
        leria o ENTER, ignorando a entrada do nome. */
        scanner.nextLine();

        System.out.println("\n--- Dados da Segunda Pessoa ---");
        System.out.println("Digite o nome da segunda pessoa: ");
        var name2 = scanner.nextLine();

        System.out.print("Digite a idade: ");
        var age2 = scanner.nextInt();

        scanner.close();

        /*
        --- Cálculo da Diferença de Idade ---
         O method Math.abs() calcula o valor absoluto, garantindo que o resultado
         seja sempre positivo, independentemente de quem é o mais velho.
        int diferença = Math.abs(idade1 - idade2);
        */
        int difference = Math.abs(age1 - age2);

        System.out.println("\n==================================");
        System.out.printf("Pessoa 1: %s (%d anos)\n", name1, age1);
        System.out.printf("Pessoa 2: %s (%d anos)\n", name2, age2);
        System.out.printf("A diferença de idade entre %s e %s é de %d anos.\n", name1, name2, difference);
        System.out.println("==================================");
    }
}