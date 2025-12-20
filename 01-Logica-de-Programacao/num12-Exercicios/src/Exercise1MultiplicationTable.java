/*
Escreva um código onde o usuário entra com um número e seja gerada a tabuada
de 1 até 10 desse número.
*/

import java.util.Scanner;

public class Exercise1MultiplicationTable {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("================ SISTEMA DE TABUADA ================\n");

        System.out.print("Digite um Número que deseja calcular: ");
        var number = scanner.nextInt();

        System.out.printf("\n----------------- TABUADA DO NÚMERO: %s -----------------\n ",number);

        for (var i = 0; i <= 10; i ++){

            var result = number * i;

            System.out.printf(" Número %s X %S = %S\n ",number, i, result);
        }
        System.out.println("-----------------  -----------------  -----------------");
        scanner.close();
    }
}
