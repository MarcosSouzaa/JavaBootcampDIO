package br.com.dio.poo.model;

//Deslocamento para a direita sem sinal

public class UnsignedRightShift {
    public static void main(String[] args) {

        var value3 = -12;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", value3, binary3 );
        var value4 = 2;
        //var binary4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo número da operação %s \n", value4);
        var result = value3 >>> value4;
        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("%s >>> %s = %s (Representação Binária %s)\n", value3, value4,result, binaryResult );

        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    }
    /*
    ------------------------------------------------------------------------
    Esse nosso (>>> ) Signed Right Shift
    0 = false
    1 = true

  Ignora o sinal (preenche as posições vazias à esquerda sempre com zero).
  Usado para manipulação pura de bits, tratando o número como um padrão de bits positivo
  (útil em criptografia, hashing, etc.).

Primeiro número da operação 12 (Representação Binária 1100)
Segundo número da operação 2
12 >>> 2 = 3 (Representação Binária 11)

 ele pega 12 binário >>>>>>>>>>>>>> 1100
 desloca à direita 2 casas >>>>>>   __1100
 completa com dois zeros >>>>>>>>>> 0011  >> Descarta os dois zeros finais.
 Número final >> 11
 ------------------------------------------------------------------------

Usando -12

Primeiro número da operação -12 (Representação Binária 11111111111111111111111111110100)
Segundo número da operação 2
-12 >>> 2 = 1073741821 (Representação Binária 111111111111111111111111111101)

ele pega 12 binário >>>>>>>>>>>>>> 11111111111111111111111111110100
 desloca à direita 2 casas >>>>>>  __111111111111111111111111111101 >> Descarta os dois zeros finais.
 completa com dois zeros >>>>>>>>> 00111111111111111111111111111101
 Número final >> 1073741821

*/
}

