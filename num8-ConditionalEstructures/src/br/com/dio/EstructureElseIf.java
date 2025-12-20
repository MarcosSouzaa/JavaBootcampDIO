package br.com.dio;

import java.util.Scanner;

public class EstructureElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        var name = scanner.next();
        System.out.println("Informe o sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (S/N): ");
        // se o que ele escrever for igual a N ou S, não importa se  maiúscula ou minúscula.
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        scanner.close();

        if(age >= 18) {
            System.out.printf("%s, você tem %s anos e pode dirigir.\n", name, age);
        }else if( age >= 16 && isEmancipated){
                System.out.printf(" %s, Apesar dos seus %s, você é emancipado(a) e pode dirigir \n",
                        name, age);
        }else{
            System.out.printf("%s, você não pode dirigir.\n",name);
        }
        System.out.println("Fim da Execução!");
    }
}
