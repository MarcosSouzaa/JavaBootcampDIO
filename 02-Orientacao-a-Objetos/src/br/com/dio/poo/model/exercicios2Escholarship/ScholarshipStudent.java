package br.com.dio.poo.model.exercicios2;

public class ScholarshipStudent extends Student {
    public ScholarshipStudent(String name) {
        // Chamamos o construtor da classe Aluno passando o tipo específico
        super(name, "bolsista"); //Define o tipo automaticamente

    }
}
