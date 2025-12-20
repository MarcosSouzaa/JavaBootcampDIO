/*
Escreva um código onde o usuário entra com seu peso e altura,
seja feito o cálculo do seu IMC (IMC = peso/(altura * altura) )
e seja exibida a mensagem de acordo com os resultados:

- Se for menor ou igual a 18,5 *Abaixo do peso*
- Se for entre 18,6 e 24,9 * Peso Ideal*
- Se for entre 25,09 e 29,9 * Levemente acima do peso*
- Se for entre 30,0 e 34,9 * Obesidade grau 1 *
- Se for entre 35,0 e 39,9 * Obesidade Grau II (Severa) *
- Se for maior ou igual a 40,0 * Obesidade III (Mórbida)*

* */

import java.util.Scanner;

public class Exercise2WeightandHeight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu peso: ");
        var weight = scanner.nextDouble();
        System.out.println("Informe a sua altura: ");
        var height = scanner.nextDouble();

        var imc = weight / (Math.pow(height, 2));

        if(imc < 18.5 ){
            System.out.printf("Seu IMC é %s Você está abaixo do peso!🙄\n", imc);
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.printf("Seu IMC é %s, Parabéns! Você está dentro do peso ideal!😎 \n", imc);
        } else if (imc >= 25.09 && imc <= 29.9 ) {
            System.out.printf("Seu IMC É %s, você está Levemente acima do peso!😁\n", imc);
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.printf("Seu IMC É %S, Obesidade grau 1!🤐\n", imc);
        } else if (imc >= 35.0 && imc <= 39.9 ) {
            System.out.printf( "Seu IMC é %s, Obesidade Grau II (Severa)!😨\n", imc);
        }else{
            System.out.printf("Seu IMC é %s, está com Obesidade III (Mórbida)!😡Cuide-se!", imc);
        }
        scanner.close();
    }
}
