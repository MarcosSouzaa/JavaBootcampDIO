package br.com.dio.poo.model;

import java.util.Scanner;

// Conhecida como Elvis Operator__ ?:
public class EstructureOr3 {
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
        /*
        A DIFERENÇA ENTRE IF E ELVIS OPERATION
        - No If você pode executar blocos de códigos e ainda usar else if ou else
        - No Elvis Operation você trabalha com a linha fazendo uma atribuição, ou
        repassando ela pra outro lugar.
        */
        var message = canDrive?
                name +", você pode dirigir.\n":
                name + ", você não pode dirigir.\n";

        System.out.println(message);
        System.out.println("Fim da Execução!");
    }
}
