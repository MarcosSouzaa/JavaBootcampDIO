package br.com.dio.poo.model;

public class ShiftOperatorLeft {

    public static void main(String[] args) {
        var value3 = -32;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", value3, binary3 );
        var value4 = 8;
        //var binary4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo número da operação %s \n", value4);
        var result = value3 << value4;
        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("%s << %s = %s (Representação Binária %s)\n", value3, value4,result, binaryResult );

    }
    /*
    ------------------------------------------------------------------------
    Esse nosso (<< ) Shift Operator Left
    0 = false
    1 = true

 Move os bits para a esquerda, preenchendo as novas posições à direita com 0s.
 Multiplicação por 2^n

Primeiro número da operação 9 (Representação Binária 1001)
Segundo número da operação 2 - Será deslocada duas casas para esquerda e 1001 será complementada por zero
1001__
100100
9 << 2 = 36 (Representação Binária 100100)

------------------------------------------------------------------------------
Exemplo com -32

Primeiro número da operação -32 (Representação Binária 11111111111111111111111111100000)
Segundo número da operação 2
-32 << 2 = -128 (Representação Binária 11111111111111111111111110000000)

------------------------------------------------------------------------------
Exemplo com -32 e deslocando 8 casas para esquerda

Primeiro número da operação -32 (Representação Binária 11111111111111111111111111100000)
Segundo número da operação 8
-32 << 8 = -8192 (Representação Binária 11111111111111111110000000000000)

*/

}

