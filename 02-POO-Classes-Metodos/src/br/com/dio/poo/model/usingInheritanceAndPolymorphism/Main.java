package br.com.dio.poo.model.InheritanceAndPolymorphism;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Marcos Souza", 150000);
        // Vou fazer um type Cast para forçar ele a entender que o funcionário (super Classe)
        // é um gerente
        ((Manager) manager).setBonus(1000);
        manager.DisplayInformation();
        manager.adjustSalary(2);
        ((Manager) manager).approveProjects("Uso de IA nos códigos java");


        Employee developer = new Developer("Marcos Souza", 12000, "Backend Java");
        developer.DisplayInformation();
        developer.adjustSalary();
    }
}
