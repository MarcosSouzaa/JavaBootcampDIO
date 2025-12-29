package br.com.dio.poo.model.exercicio3SchoolSystem;

public class Person {
    private String name;
    private int age;

    //Construtor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Getter e setter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
