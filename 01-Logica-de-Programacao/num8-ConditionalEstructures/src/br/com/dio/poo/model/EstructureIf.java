package br.com.dio.poo.model;
/* configura uma expressão que vai resultar num valor boolean que será verificado pelo IF
Se esse valor for true ele executada o trecho de código, se não ele ignora.
 */

import java.util.Scanner;

public class EstructureIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        var name = scanner.next();

        System.out.println("Informe o sua idade: ");
        var age = scanner.nextInt();
        scanner.close();
        //se tiver só uma linha de código, não preciso usar chaves {}
        if(age >= 18) {
            System.out.printf("%s, você tem %s anos e pode dirigir.\n",name, age);
        }else{
            System.out.printf("%s, você não pode dirigir.\n",name);
        }
        System.out.println("Fim da Execução!");
    }
}
