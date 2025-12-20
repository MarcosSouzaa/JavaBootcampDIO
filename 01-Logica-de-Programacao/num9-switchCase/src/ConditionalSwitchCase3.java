import java.util.Scanner;

/*
 TRABALHANDO COM STRINGS:  case "1": obs: Nesse caso, ao passar o número
 já aparece o texto quando clicar na opção.
*/
public class ConditionalSwitchCase3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7: ");
        var option = scan.next();

        switch (option){
            case "1":
                System.out.println("Domingo");
                break;
            case "2":
                System.out.println("Segunda-feira");
                break;
            case "3":
                System.out.println("Terça-feira");
                break;
            case "4":
                System.out.println("Quarta-feira");
                break;
            case "5":
                System.out.println("Quinta-feira");
                break;
            case "6":
                System.out.println("Sexta-feira");
                break;
            case "7":
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Ops😢! Opção inválida!");
        }
    }
}
