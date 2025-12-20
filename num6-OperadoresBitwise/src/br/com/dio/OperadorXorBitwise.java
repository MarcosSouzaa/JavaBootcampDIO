package br.com.dio;

public class OperadorXorBitwise {
    public static void main(String[] args) {

        var value3 = 6;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", value3, binary3 );
        var value4 = 5;
        var binary4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", value4, binary4);
        var result = value3 ^ value4;
        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("%s ^ %s = %s (Representação Binária %s)\n", value3, value4,result, binaryResult );

    }
    /*
    -------------------------------------------------------------
    Esse nosso (^) XOR vai fazer a comparação com cada bit do número:
    0 = false
    1 = true

Retorna 1 se os bits correspondentes forem diferentes (um número for 1 e o outro for 0). Retorna 0 se forem iguais.
101 ^ 110 = 011

    -------------------------------------------------------------
     Número | Binário                |    Número | Binário
       6    |  110                   |      6    |   110
       5    |  101                   |      2    |    10 (Aqui é 010)
   Soma ____:  011 ==>11 em Binário  |   Soma        100 ==> 4 em Binário

   Essa é a representação máxima do Bit: 1111111111111111111111111111111

     */

}


