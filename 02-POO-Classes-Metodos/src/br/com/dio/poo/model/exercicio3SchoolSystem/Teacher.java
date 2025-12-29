package br.com.dio.poo.model.exercicio3SchoolSystem;

public class Teacher extends Person {
    // recebe a disciplina
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayData() {
        System.out.printf("\nDocente: %s - Idade: %d - Disciplina: %s",
                getName(),
                getAge(),
                subject);
    }
}
