package br.com.dio;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        System.out.println("-------------------------------  OPERADORES ARITMÉTICOS ------------------------------- ");

        System.out.println("\n==========================  ADIÇÃO  ==========================\n ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();

        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);

        System.out.println("\n==========================  SUBTRAÇÃO  ==========================\n ");

        System.out.println("Informe o primeiro número: ");
        var value4 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        var value3 = scanner.nextInt();
        System.out.printf("%s - %s = %s\n", value4, value3, value4 - value3);

        System.out.println("\n=================== DIVISÃO / RESTO DA DIVISÃO ====================\n ");

        System.out.println("Informe o primeiro número: ");
        var value5 = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        var value6 = scanner.nextDouble();
        System.out.printf("%s ÷ %s = %s\n", value5, value6, value5 / value6);

        System.out.println("\nMostra o resto da divisão");
        System.out.printf("%s %% %s = %s\n", value5, value6, value5 % value6);

        System.out.println("\n=================== RAIZ QUADRADA - Classe math ====================\n ");

        System.out.println("Digite um número: ");
        var value7 = scanner.nextInt();
        System.out.printf(" A raiz quadrada de %s é = %s \n", value7, Math.sqrt(value7));

        System.out.println("\n=================== POTÊNCIA - Classe math   ====================\n ");

        System.out.println("Digite um número: ");
        var value8 = scanner.nextInt();
        System.out.printf(" A Potência de %s é = %s \n", value8, Math.pow(value8, 2));

    }
}
