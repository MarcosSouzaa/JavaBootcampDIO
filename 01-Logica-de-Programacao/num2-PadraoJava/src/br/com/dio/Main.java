package br.com.dio;

import java.util.Scanner;

public class Main {
    //Utilizando uma constante global
    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome: ";

    public static void main(String[] args) {
        // Poderia também usar: var scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        // Poderia usar: var nome = scanner.next();
        String nome = scanner.next();

        System.out.println("Informe a sua idade: ");
        // Poderia usar: var age = scanner.nextInt();
        int age = scanner.nextInt();

        System.out.printf("Olá %s, sua idade é %s \n", nome, age );

    }
}
