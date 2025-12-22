package br.com.dio.usingConstructors;

import java.sql.SQLOutput;

public class CarTest {

    public static void main(String[] args) {

        //Inicialização do Objeto com construtor vazio
        Car ferrari = new Car ();

        ferrari.model = "Ferrari Enzo";
        ferrari.maximumSpeed = 349;
        ferrari.zeroToOneHundredSeconds = 3.2;

        //Inicialização do Objeto com construtor com parâmetros
        Car koenigsegg = new Car("Koenigsegg", 430, 3.1);

        System.out.println(ferrari.model);
        System.out.println(koenigsegg.maximumSpeed);
    }
}
