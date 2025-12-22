package br.com.dio.usingStatic;

public class GalinhaTest {

    public static void main(String[] args) {

        Galinha g1 = new Galinha();
        g1.botar().botar().botar();

        Galinha g2 = new Galinha();
        g2.botar().botar();

        System.out.println("Quantidade de ovos da galinha 1: " + g1.ovos);
        System.out.println("Quantidade de ovos da galinha 2: " + g2.ovos);
        System.out.println("Quantidade de ovos da granja: " + Galinha.ovosDaGranja);
        System.out.println("Média dos ovos da granja: "+ Galinha.mediaDeOvos(2));
    }

}
