import java.util.Scanner;

/*
 Esse for vazio com uso de if para comparação e break para sair,
 Pedirá ao usuário para digitar nomes enquanto não for digitado
 exit.
*/

public class ForLoopStructureScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.println("Digite um nome ou exit para sair: ");
            var nome = scanner.next();

            //Aqui quero comparar nome (String), então não pode ser (==)
            //ignoreCase para aceitar maiúscula e minúscula
            if(nome.equalsIgnoreCase("exit")) break;
        }
    }
 }
