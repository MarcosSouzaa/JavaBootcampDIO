package br.com.dio.poo.model.InheritanceAndPolymorphism;
// Vai me pedir implementação
public class Manager extends Employee implements Aprover{

    private double bonus;

//Aqui, a própria IDE me sugere criar um construtor compatível com a classe que está herdando
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    // Polimorfismo de sobre escrita (Override)
    // Sobrescrita do method exibirInformações (Polimorfismo da class Super)
    @Override
    public void DisplayInformation() {
        System.out.printf("\nGerente: %s - salário %.2f - bônus: %.2f",
                name, salary, bonus);
    }

    @Override
    public void calculatePLR() {
        System.out.println("PLR do gerente");
    }

    //implementação da interface
    @Override
    public void approveProjects(String projectName) {
        System.out.printf("\nGerente %s aprovou o projeto %s",
                name, projectName);
    }
}

