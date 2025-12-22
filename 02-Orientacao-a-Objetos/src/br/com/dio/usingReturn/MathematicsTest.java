package br.com.dio.usingReturn;

public class MathematicsTest {

    public static void main(String[] args) {

        Mathematics m = new Mathematics();
        int numMaior = m.maior(10,-20);
        System.out.println(numMaior);

        double som = m.soma(10, 20);
        System.out.println(som);

    }

}
