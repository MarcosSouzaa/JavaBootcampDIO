package br.com.dio;

import java.util.Scanner;

public class UsingOperators {
    public static void main(String[] args) {
        System.out.println("\n----------------------------  trabalhando com operadores ----------------------------\n");

        System.out.println("============================= Valores de Igualdade e Boolean ==========================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto é 2 + 2 ?");
            var result = scanner.nextInt();
            var isRight = result == 4;

        System.out.printf("O resultado é 4, você acertou? %s\n", isRight); //true
        //Invertendo o valor bolleano com o operador "!" Not
        System.out.printf("O resultado é 4, você errou? %s\n", !isRight);//false

        System.out.println("================================= Valores >, <, >=, <=   ==============================\n");

        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        var canDrive = age > 17;
        var canNotDrive = age <= 17;
        System.out.printf("Você tem %s anos, você pode dirigir? (%b) \n",age,  canDrive);
        System.out.printf("Você tem %s  anos, você pode dirigir? (%b) \n" , age, !canNotDrive );

        System.out.println("=================================== Valores || or e >= ================================\n");

        System.out.println("Você é emancipado(a)?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive2 = age >= 18 || isEmancipated;
        System.out.printf("Você tem %s  anos, você pode dirigir? (%s) \n", age , canDrive2);


        System.out.println("================================= Valores || or e && and ==============================\n");

        var canDrive3 = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Você tem %s  anos, você pode dirigir? (%b) \n" , age, canDrive3);

    }

}
