package br.com.dio.poo.model;

/**
 * O for aprimorado, ele percorre todos os elementos dentro do seu array list
 * ou dentro de um array.
 * Começa com o nome for, depois você declara o tipo que você tem dentro do array ou do array list ex: int,
 * fornece um nome para essa variável ex.: int par seguida de ":", retorna o nome do elemento que ele
 * deve percorrer. Podemos ler da seguinte maneira:
 * Percorra cada elemento par do tipo int, existente dentro de pares. Depois posso imprimir esse elemento.
 *
 * Observação: Esse for só percorre o laço para frente e não acessa o i do for tradicional
 */

public class UsingForEach {

    public static void main(String[] args) {

        String[] nomes = {"Rosana", "Margareth", "Andreia", "Luciana", "Mauro"};

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
