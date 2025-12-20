import java.util.Scanner;

public class StructureWhileExitBreak2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var name = "";
        while (true) {
            System.out.println("Informe um nome:");
            name = scanner.next();
            System.out.println(name);

            if(name.equalsIgnoreCase("exit")) break;
        }
    }
}
