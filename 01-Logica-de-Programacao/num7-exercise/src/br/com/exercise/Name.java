package br.com.exercise;

import java.time.LocalDate;
import java.util.Scanner;

/*
Escreva um código que receba um nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem:
Olá Fulano! Você tem X anos!
* */
public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o seu primeiro nome: ");
        var name = scanner.next();

        System.out.println("Escreva o ano do seu nascimento: ");
        var yearOfBirth = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();
        int currentAge = currentYear - yearOfBirth;

        System.out.printf("Olá %s! Você tem %s anos!\n", name, currentAge);

        scanner.close();
    }
}
