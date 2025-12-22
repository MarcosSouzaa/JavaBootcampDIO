package br.com.dio;

import java.util.ArrayList;

/**
 * Usando um array List do java lang, tem que importar a classe e estanciar.
 * usar o for para percorrer a lista de Inteiro até 10 e usar o forEach para
 * percorrer a lista.
 *
 */

public class UsingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            list.add(i);
        }
        for(Integer numero : list){
            System.out.println(numero);
        }
    }
}
