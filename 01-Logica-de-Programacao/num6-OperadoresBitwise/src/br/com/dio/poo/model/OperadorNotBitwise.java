package br.com.dio.poo.model;

/*
 * o operador NOT Bitwise (~) em Java é frequentemente chamado de operador de complemento
 *  (ou Complemento de um).
 * */
public class OperadorNotBitwise {
    public static void main(String[] args) {var value7 = -789;
        var binary7 = Integer.toBinaryString(value7);
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", value7, binary7 );

        var result = ~value7;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" ~%s = %s (Representação Binária %s)\n", value7,  result, binaryResult );

    }
    /*
    -------------------------------------------------------------
    Esse nosso (~) NOT (Complements) vai fazer a comparação com cada bit do número:
    0 = false
    1 = true

Inverte o valor de cada bit (0 se torna 1, e 1 se torna 0). É aplicado apenas a um único operando.
~101 = 010 (em um sistema de 3 bits)

    00000000000000000000000000000110 ==>  6 - O que é positivo vira negativo aqui embaixo
    11111111111111111111111111111001 ==> -7 - O que é negativo vira positivo e o resultado é (-7).

    - Segundo exemplo:

     Primeiro número da operação -789 (Representação Binária 11111111111111111111110011101011)
    ~-789 = 788 (Representação Binária 1100010100)

    */

}

