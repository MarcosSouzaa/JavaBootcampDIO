package br.com.dio;

public class Precedencia {

    public static void main(String[] args) {

        System.out.println("\n==================== PRECEDÊNCIA ====================\n");
        //
        var value = (5 + 9) * (10 - 5) / 2; //35
        System.out.println(value);


 /*
        * 🧮 Tabela de Precedência de Operadores em Java
Nível	Categoria	Operadores	Associatividade
1	Unário e Pós-fixado	(), [], ., ++ (pós), -- (pós)	Esquerda para Direita
2	Unário	++ (pré), -- (pré), +, -, !, ~, (tipo) (cast)	Direita para Esquerda
3	Multiplicativo	*, /, % (Módulo/Resto)	Esquerda para Direita
4	Aditivo	+, -	Esquerda para Direita
5	Shift (Bitwise)	<<, >>, >>>	Esquerda para Direita
6	Relacional (Comparação)	<, >, <=, >=	Esquerda para Direita
7	Igualdade	==, !=	Esquerda para Direita
8	Lógico Bitwise	& (AND)	Esquerda para Direita
9	Lógico Bitwise	^ (XOR)	Esquerda para Direita
10	Lógico Bitwise	`	` (OR)
11	Lógico Condicional	&& (AND Condicional)	Esquerda para Direita
12	Lógico Condicional	`
13	Ternário	?:	Direita para Esquerda
14	Atribuição	=, +=, -=, *=, /=, etc.	Direita para Esquerda

 💡 Dicas Importantes:
Parênteses Têm Prioridade Total: Se você tiver dúvidas sobre a ordem de avaliação, use parênteses ().
* Qualquer expressão dentro de parênteses será sempre avaliada primeiro.

Exemplo: 5 + 2 * 3 (resultado 11) é diferente de (5 + 2) * 3 (resultado 21).

Concatenação de Strings (+): O operador + pode atuar como soma (Nível 4) ou como operador de
* concatenação de Strings. Se um dos operandos for uma String, o Java trata todos os
* seguintes como concatenação.
*/
    }
}
