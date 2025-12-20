import java.util.Scanner;

/*
   Essa opção não usa o BREAK e acrescenta esse arrow -> (seta)
 */

public class ConditionalSwithCase4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7: ");
        var option = scan.nextInt();

        switch (option){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default ->  System.out.println("Ops😢! Opção inválida!");
        }
    }
}
