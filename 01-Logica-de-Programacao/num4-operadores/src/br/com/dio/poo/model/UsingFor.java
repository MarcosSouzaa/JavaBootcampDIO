package br.com.dio.poo.model;

/**
 * FOREACH -  Esse fluxo é utilizado para percorrer um array ou array list
 * Imagine que você tem um array de números pares e quer apresentar na Tela do sistema
 * Você cria uma estrutura de repetição para percorrer todos esses elementos.
 * Com esse for eu consigo ter controle total do fluxo, para frente e para trás.
 */

public class UsingFor {

    public static void main(String[] args) {

        int [] pares = {2,4,6,8,10,12} ;
        /* Percorro enquanto i for menor que o tamanho (length -> comprimento da variável pares
        e recupero com a variável par cada uma dessas posições percorridas */
        for(int i = 0; i < pares.length; i++){
            int par = pares[i];
            System.out.println(par);
            /* imprime:
            2
            4
            6
            8
            10
            12
            */
        }

    }

}
