package br.com.dio.poo.model.exercicio3SchoolSystem;

import javax.security.auth.Subject;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Júlia", 16, 8.5);
        Student student2 = new Student("Caio", 17, 7.2);

        Teacher teacher1 = new Teacher("Marta", 40, "Matemática");
        Teacher teacher2 = new Teacher("Roberto", 30, "História");

        student1.displayData();
        student2.displayData();

        teacher1.displayData();
        teacher2.displayData();
    }
}
