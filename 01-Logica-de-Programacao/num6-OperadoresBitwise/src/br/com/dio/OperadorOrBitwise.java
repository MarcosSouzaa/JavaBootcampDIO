package br.com.dio;

/*usados com "long, int, short, char e byte */
public class OperadorOrBitwise {

    public static void main(String []args){

        var value1 = 4;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", value1, binary1 );
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", value2, binary2);
        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("%s | %s = %s (Representação Binária %s)\n", value1, value2,result, binaryResult );
    }
    /*
    -------------------------------------------------------------
    Esse nosso OR vai fazer a comparação com cada bit do número:
    0 = false
    1 = true

    Retorna 1 se pelo menos um dos bits correspondentes for 1. Retorna 0 apenas se ambos forem 0.

    Ex: 1 | 0 (um ou zero) Retorna 1; 0 | 0 (ele retorna zero)
    -------------------------------------------------------------
     Número | Binário                |    Número | Binário
       6    |  110                   |      4    |   100
       5    |  101                   |      5    |   101
   Soma ____:  111 ==> 7 em Binário  |   Soma        101 ==> 5 em Binário

     */

}

