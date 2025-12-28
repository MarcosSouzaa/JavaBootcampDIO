package br.com.dio.poo.model.exercicios2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Fernanda", "regular");
        ScholarshipStudent student2 = new ScholarshipStudent("lucas");

        student1.identify();
        student2.identify();

    }
}
