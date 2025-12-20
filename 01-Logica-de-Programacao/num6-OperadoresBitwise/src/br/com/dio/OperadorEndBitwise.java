package br.com.dio;

public class OperadorEndBitwise {

    public static void main(String []args){

        var value3 = 6;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", value3, binary3 );
        var value4 = 2;
        var binary4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", value4, binary4);
        var result = value3 & value4;
        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("%s & %s = %s (Representação Binária %s)\n", value3, value4,result, binaryResult );

        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE)); //1111111111111111111111111111111
    }
    /*
    -------------------------------------------------------------
    Esse nosso & end vai fazer a comparação com cada bit do número:
    0 = false
    1 = true

    Retorna 1 se ambos os bits correspondentes forem 1. Retorna 0 em qualquer outro caso.

    Ex: 1 | 0 (um ou zero) Retorna 0 ; 0 | 0 (ele retorna 0) ;
    -------------------------------------------------------------
     Número | Binário                |    Número | Binário
       6    |  110                   |      6    |   110
       5    |  101                   |      2    |    10
   Soma ____:  100 ==> 4 em Binário  |   Soma         10 ==> 2 em Binário (Aqui é 010)

   Essa é a representação máxima do Bit: 1111111111111111111111111111111

     */

}

