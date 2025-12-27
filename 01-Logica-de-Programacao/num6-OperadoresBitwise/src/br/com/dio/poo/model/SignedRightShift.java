package br.com.dio.poo.model;

public class SignedRightShift {
    public static void main(String[] args) {
        var value3 = -8;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", value3, binary3 );
        var value4 = 2;
        //var binary4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo número da operação %s \n", value4);
        var result = value3 >> value4;
        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("%s >> %s = %s (Representação Binária %s)\n", value3, value4,result, binaryResult );

        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    }
    /*
    ------------------------------------------------------------------------
    Esse nosso (>> ) Signed Right Shift
    0 = false
    1 = true

 Preserva o sinal (copia o bit de sinal para as posições vazias à esquerda).
 Usado para divisão inteira rápida por 2^n que respeita números negativos.


 Primeiro número da operação 8 (Representação Binária 1000)
  Segundo número da operação 2.
8 >> 2 = 2 (Representação Binária 10)

ele pega >>>>>>>>>>>>>>>> 1000
desloca à direita >>>>>>> __1000
descarta os dois zeros>>>>> 10 >> Número final.
------------------------------------------------------------------------------
Exemplo com 88 deslocando 2 casas para direita

Primeiro número da operação 88 (Representação Binária 1011000)
Segundo número da operação 2
88 >> 2 = 22 (Representação Binária 10110)
------------------------------------------------------------------------------
Exemplo com 1 -  Ele vai retirar a única representação binária e o resultado será zero.

Primeiro número da operação 1 (Representação Binária 1)
Segundo número da operação 2
1 >> 2 = 0 (Representação Binária 0)

------------------------------------------------------------------------------
Utilizando -8

Primeiro número da operação -8 (Representação Binária 11111111111111111111111111111000)
Segundo número da operação 2
-8 >> 2 = -2 (Representação Binária 11111111111111111111111111111110)

 ele pega 8 binário >>>>>>>>>>>>>>>> 100011111111111111111111111111111000
 desloca à direita 2 casas >>>>>>    __11111111111111111111111111111110
 descarta os dois zeros >>>>>>>>>>>>>  1111111111111111111111111111111

Ele verifica se o último número à esquerda é negativo e troca por positivo e se for negativo
ele troca por positivo: 1111111111111111111111111111111


*/

}
