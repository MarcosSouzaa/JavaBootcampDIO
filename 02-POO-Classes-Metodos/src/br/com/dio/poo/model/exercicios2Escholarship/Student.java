package br.com.dio.poo.model.exercicios2;

public class Student {
    private String name;
    private String type;

    public Student(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void identify() {
        System.out.printf("\nAluno: %s - tipo: %s",name, type);
    }
}
