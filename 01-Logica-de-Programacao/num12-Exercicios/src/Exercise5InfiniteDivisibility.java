/*
Escreva um código onde o usuário informa um número inicial, posteriormente irá informar
outros N números, a execução do código irá continuar até que o número informado dividido
pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro
número devem ser ignorados.

Para resolver esse problema, utilizaremos um laço de repetição while (enquanto).
A lógica principal será verificar duas condições para cada novo número digitado:

Se o número é menor que o primeiro (nesse caso, ele é ignorado).
Se o resto da divisão (%) pelo primeiro número é igual a zero.
*/

import java.util.Scanner;

public class Exercise5InfiniteDivisibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Informar o número inicial (divisor)
        System.out.println("Informe o número inicial (Divisor)");
        var numeroInicial = scanner.nextInt();

        // Variável para controlar o laço
        boolean continuar = true;

        System.out.println("O código continuará enquanto os números forem múltiplos de " + numeroInicial);
        System.out.println("Números menores que " + numeroInicial + " serão ignorados\n");

        // 2. Início do laço para N números
        while (continuar ){
            System.out.print("Informe um novo número: ");
            var novoNumero = scanner.nextInt();

            // Regra: Números menores que o primeiro devem ser ignorados
            if (novoNumero < numeroInicial) {
                System.out.println("-> Número menor que o inicial, Ignorado 😡...");
                continue; // Volta para o início do while sem testar o resto
            }
            // Regra: Parar se o resto da divisão for diferente de 0
            if (novoNumero % numeroInicial != 0){
                System.out.println("-> O resto da divisão de " + novoNumero + " por " + numeroInicial + " é " + (novoNumero % numeroInicial) + ".");
                System.out.println("-> Execução encerrada!");
                continuar = false;
            }else {
                System.out.println("-> " + novoNumero + " é múltiplo de " + numeroInicial + ". Continuando ...");
            }
        }
    }
}

/*
Explicação do que o código faz:
while (continuar): O programa entra em um ciclo de repetição. A única forma de sair é mudando a variável
continuar para false.

continue: Quando o usuário digita um número menor que o inicial, o comando continue faz o Java ignorar
todo o código abaixo dele e voltar imediatamente para o topo do while, pedindo um novo número.

novoNumero % numeroInicial != 0: Este é o teste do resto da divisão. Se você digitar, por exemplo,
 o número inicial 5 e depois digitar 11, o resto é 1. Como 1 é diferente de 0, a condição é verdadeira
  e o programa para.

Múltiplos: O programa só aceita (continua) se você digitar números como 10, 15, 20 (no caso do divisor
 ser 5), pois o resto da divisão desses números por 5 é sempre 0.
*/