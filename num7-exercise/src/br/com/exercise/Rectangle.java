package br.com.exercise;

import java.util.Scanner;

/*
Escreva um código que receba a base e altura de um retângulo, calcule sua área e exiba na tela.
formula: A = b * h (Area = base * height)
*/
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Escreva o valor em cm da base do Retângulo:");
        var base = scanner.nextInt();

        System.out.println(" Escreva o valor em cm da altura do Retângulo:");
        var height = scanner.nextInt();
        int area = base * height;

        System.out.printf("Um retângulo com a base de %s cm e a altura de %s cm tem a área de %s cm² \n",
                base,
                height,
                area);

        scanner.close();
    }
}
