/*
3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior
que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos
os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números
informados, incluindo os números informados e em ordem decrescente;
 */
/*

Para resolver esse problema, utilizaremos uma estrutura de repetição for que percorre o intervalo
do maior para o menor número (ordem decrescente) e uma estrutura condicional if com o operador
de resto da divisão % para filtrar apenas os números desejados.
*/

import java.util.Scanner;

public class Exercise4EvenOrOdd {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // 1. Entrada do primeiro número
        System.out.print("Digite o primeiro número: ");
        var n1 = scanner.nextInt();

        // 2. Entrada do segundo número (garantindo que seja maior)
        int n2;
        do {
            System.out.print("Digite o segundo número (deve ser maior que o primeiro): ");
            n2 = scanner.nextInt();
            if (n2 <= n1) {
                System.out.println("Erro: O segundo número precisa ser maior que " + n1);
            }
        } while (n2 <= n1);

        // 3. Escolha entre Par ou Ímpar
        System.out.println("O que você deseja listar?");
        System.out.println("1 - Pares");
        System.out.println("2 - Ímpares");
        int opcao = scanner.nextInt();

        // 4. Laço de repetição decrescente (do maior n2 para o menor n1)
        System.out.println("\nResultado em ordem decrescente:");

        for (int i = n2; i >=  n1; i--) {
            if (opcao == 1) { //Caso queira pares
                if(i % 2 == 0 ) {
                    System.out.println(i + " ");
                }

            } else if( opcao == 2) { //Caso queira impares
               if( i % 2 != 0) {
                   System.out.println(i + "");
               }
            }

        }
        scanner.close();
    }
}

/*
Explicação dos Pontos Chave:
Validação com do-while: Usei um laço para forçar o usuário a digitar um segundo número válido
(maior que o primeiro), evitando que o programa tente processar um intervalo inexistente.

Ordem Decrescente: No for, iniciamos o contador com o maior valor (int i = n2), definimos a parada no
 menor valor (i >= n1) e usamos o decremento (i--).

Lógica de Paridade:

Par: i % 2 == 0 (O resto da divisão por 2 é zero).

Ímpar: i % 2 != 0 (O resto da divisão por 2 não é zero).
 */