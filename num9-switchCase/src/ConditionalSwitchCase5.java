import java.util.Scanner;

/*
 - Switch Expression (Java Moderno) => var message = switch (option) {.. cases ...};
 - o switch expression (Expressão Switch) retorna um valor que é armazenado na variável message.
 - Seta (->): Substitui o uso do case: e a necessidade do break; explícito. A seta indica que o
   resultado à direita dela será o valor de retorno da expressão switch para aquele case.

- Agrupamento de Cases (case 1, 7): Esta sintaxe moderna permite agrupar múltiplos valores para o
 mesmo bloco de código (1 e 7 são Domingo e Sábado, respectivamente).

Bloco de Código ({ ... }): Como a lógica dentro deste caso é complexa (precisa de uma variável
temporária day e do operador ternário), usamos um bloco de código.

Operador Ternário (? :):

option == 1 ? "Domingo" : "Sábado"

Funciona como um if simplificado: Se a condição (option == 1) for verdadeira, ele retorna "Domingo".
 Caso contrário (o número deve ser 7, já que só verificamos 1 e 7), ele retorna "Sábado".

yield: Dentro de um bloco de código complexo ({}) em uma switch expression, o yield é usado para
 retornar explicitamente o valor que será atribuído à variável message.

   case 1, 7 -> {
    var day = option == 1 ? "Domingo" : "Sábado";
    yield String.format("Mas é %s, Fim de Semana \\ô/", day);
}
*/
public class ConditionalSwitchCase5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7: ");
        var option = scan.nextInt();
        var message = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Mas é %s, Fim de Semana \\ô/",day);
            }

            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Ops😢! Opção inválida!";
        };
        System.out.println(message);
    }

}

