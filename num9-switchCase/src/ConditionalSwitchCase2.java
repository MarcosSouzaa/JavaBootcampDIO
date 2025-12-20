import java.util.Scanner;

/*
 Usando opções AGRUPADAS
*/
public class ConditionalSwitchCase2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7: ");
        var option = scan.nextInt();

        switch (option){
            //AGRUPANDO DOIS CASES AQUI
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;

            default:
                System.out.println("Ops😢! Opção inválida!");
        }
    }
}
