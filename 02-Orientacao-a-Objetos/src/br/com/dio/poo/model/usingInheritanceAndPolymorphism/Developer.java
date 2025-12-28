package br.com.dio.poo.model.InheritanceAndPolymorphism;

public class Developer extends Employee {
    private String stack;

    public Developer(String name, double salary, String stack) {
        super(name, salary); //chama a classe mãe
        this.stack = stack; // passa a especialidade que criei
        // daqui vou para classe principal para criar o desenvolvedor
    }
    // Polimorfismo de sobre escrita (Override)
    @Override
    public void DisplayInformation() {
        System.out.printf("\nDesenvolvedor: %s salário: %.2f - stack: %s",
                name, salary, stack);
    }
    //method abstrato para ser implementado
    @Override
    public void calculatePLR() {
        System.out.println("PLR do Desenvolvedor");
    }

}