package br.com.dio.poo.model.exercicio3SchoolSystem;

public class Student extends Person{
    // nota do aluno
   private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayData(){
        System.out.printf("\nAluno: %s - Idade: %d - Nota: %.2f ",getName(),getAge(),grade);
    }
}
