package br.com.dio.poo.model;

public class Incremento {
    public static void main(String[] args) {
        System.out.println(" ++ antes da variável, atribui 1 ao Valor da variável");
        var value = 50;
        System.out.println(++value);//acrescenta 1 à 51
        System.out.println(--value); // tira 1 de 51

      System.out.println(" ++ depois da variável Usa o Valor e na Próxima linha de execução atribui");
        System.out.println(value++); //lê a variável 50
        System.out.println(value); // Acrescenta 1 na linha seguinte
    }
}
