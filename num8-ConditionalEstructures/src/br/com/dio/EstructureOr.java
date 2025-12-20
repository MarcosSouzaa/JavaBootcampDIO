package br.com.dio;

import java.util.Scanner;

public class EstructureOr {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        var name = scanner.next();
        System.out.println("Informe o sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (S/N): ");
        //se o que ele escrever for igual a N ou S, não importa se maiúscula ou minúscula.
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        scanner.close();

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);

        if(canDrive) {
            System.out.printf("%s, você pode dirigir.\n", name);

        }else{
            System.out.printf("%s, você não pode dirigir.\n",name);
        }
        System.out.println("Fim da Execução!");
    }
}
