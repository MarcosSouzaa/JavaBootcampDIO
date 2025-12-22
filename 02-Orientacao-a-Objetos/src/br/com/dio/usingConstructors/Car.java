package br.com.dio.usingConstructors;

/**
 * CONSTRUTORES
 * São blocos de comandos usados para inicializar os objetos
 * Todas as classes têm construtores, mesmo que eu não declare explicitamente, quando isso acontece
 * o compilador cria uma classe para ela.
 * O construtor tem o mesmo nome da Classe
 * O construtor parece com um method, mas ele não retorna valor: << Create >> Carro()
 */
public class Car {

    String model;
    int maximumSpeed;
    double zeroToOneHundredSeconds;

    // Construtor vazio que existe mesmo que eu não declare
    public Car() {

    }

    //Construtor declarado
    public Car(String model, int maximumSpeed, double zeroToOneHundredSeconds) {
        this.model = model;
        this.maximumSpeed = maximumSpeed;
        this.zeroToOneHundredSeconds = zeroToOneHundredSeconds;

    }
}

