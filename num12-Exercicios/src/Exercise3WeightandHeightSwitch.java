/*
Tradicionalmente, o switch no Java era usado apenas para valores exatos (como 1, 2, "A").
Porém, a partir do Java 17 e 21 (Pattern Matching), o switch ficou muito mais poderoso e
agora permite trabalhar com intervalos de forma muito elegante.
Aqui está o seu código refatorado usando o Switch Expression moderno:
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercise3WeightandHeightSwitch {

    public static void main(String[] args) {
        // Configura o scanner para aceitar ponto em vez de vírgula
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o seu peso (ex: 80.5): ");
        var weight = scanner.nextDouble();

        System.out.println("Informe a sua altura (ex: 1.75): ");
        var height = scanner.nextDouble();

        var imc = weight / Math.pow(height, 2);

        // Usando Switch Expression (Java 17+)
        String mensagem = switch ((Double) imc) {
            case Double i when i < 18.5 ->
                    String.format("Seu IMC é %.2f. Você está abaixo do peso! 🙄", i);
            case Double i when i <= 24.9 ->
                    String.format("Seu IMC é %.2f. Parabéns! Peso ideal! 😎", i);
            case Double i when i <= 29.9 ->
                    String.format("Seu IMC é %.2f. Levemente acima do peso! 😁", i);
            case Double i when i <= 34.9 ->
                    String.format("Seu IMC é %.2f. Obesidade grau I! 🤐", i);
            case Double i when i <= 39.9 ->
                    String.format("Seu IMC é %.2f. Obesidade Grau II (Severa)! 😨", i);
            default ->
                    String.format("Seu IMC é %.2f. Obesidade III (Mórbida)! 😡 Cuide-se!", imc);
        };

        System.out.println(mensagem);
        scanner.close();
    }
}

