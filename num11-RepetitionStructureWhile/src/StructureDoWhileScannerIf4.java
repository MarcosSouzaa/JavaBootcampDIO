import java.util.Scanner;

public class StructureDoWhileScannerIf4 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Digite um número (ou Digite 0 para parar!)");
            numero = terminal.nextInt();
            if(numero != 0){
                System.out.println("Você digitou: " + numero);
            }
        } while (numero!= 0);
        System.out.println("Programa Encerrado! Até logot 🖐🖐");
    }
}
