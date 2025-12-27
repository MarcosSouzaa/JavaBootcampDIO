package br.com.dio.poo.model;

import java.util.Scanner;
/**
 * Outra forma de usar a estrutura OR
 */
public class EstructureOr2 {
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
        var message = "";

        if(canDrive) {
           message = name +", você pode dirigir.\n";

        }else{
           message = name + ", você não pode dirigir.\n";
        }
        System.out.println(message);
        System.out.println("Fim da Execução!");
    }
}
