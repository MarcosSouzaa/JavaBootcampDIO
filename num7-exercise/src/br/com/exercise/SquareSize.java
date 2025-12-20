package br.com.exercise;

import java.util.Scanner;

/*
Escreva um código que receba o tamanho do lado de um quadrado e calcule sua área e exiba na tela.
Fórmula: A=L×L ou A=L^2 ou Resultado=Math.pow(base,expoente)
*/
public class SquareSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Escreva o tamanho de um lado do quadrado em centímetros:");
        var sideOfTheSquare = scanner.nextInt();
        double area = Math.pow(sideOfTheSquare, 2);

        System.out.printf("A área do quadrado de lado com %s cm é %.2f cm². \n",sideOfTheSquare, area );

        scanner.close();
    }
}
