import java.util.Scanner;

/*
🔄 Diferença Crucial: while vs do-while

Para fixar bem o conceito, veja esta comparação:

- Estrutura	- Quando verifica a condição? -	Quantas vezes o código roda?
  while	    - No início (Antes de rodar). -	Pode rodar zero vezes se a condição for falsa de cara.
  do-while	- No final (Depois de rodar). -	Roda pelo menos uma vez, obrigatoriamente.
*/

public class StructureWhileExit1 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in) ;
        var name = "";

        while(!name.equalsIgnoreCase("exit")) {
            System.out.println("Digite um nome:");
            name = scanner.next();
            System.out.println(name);
        }
    }
}
