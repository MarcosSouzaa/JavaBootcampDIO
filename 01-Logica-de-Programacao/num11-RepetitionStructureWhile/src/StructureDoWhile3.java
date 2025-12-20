/*
* 🔍 Por que usar o do-while aqui?
Execução Inicial: O Java entra no bloco do { ... } sem fazer perguntas.

Ação: Ele imprime o número e aumenta o contador.

Verificação: Só ao final (no while) ele verifica: "O contador ainda é menor ou igual a 5?".

Se sim, ele volta para o topo do do.

Se não, ele sai do loop.
*
*/

public class StructureDoWhile3 {

    public static void main(String[] args) {
        int contador = 1;

        do{
            System.out.println("Número: " + contador);
            contador ++;
        } while(contador <= 5);
        System.out.println("Fim do Loop!");

/*
🔄 Diferença Crucial: while vs do-while
Para fixar bem o conceito, veja esta comparação:

- Estrutura	- Quando verifica a condição? -	Quantas vezes o código roda?
  while	    - No início (Antes de rodar). -	Pode rodar zero vezes se a condição for falsa de cara.
  do-while	- No final (Depois de rodar). -	Roda pelo menos uma vez, obrigatoriamente.
*/
    }
}
