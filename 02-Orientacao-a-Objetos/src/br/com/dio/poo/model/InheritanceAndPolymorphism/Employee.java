package br.com.dio.poo.model.InheritanceAndPolymorphism;

import java.sql.SQLOutput;
/* CLASSE ABSTRATA
 * Employee HRAnalyst = new Employee(); Aqui dará erro!
 * Dessa forma seria muito genérico e eu gostaria que fosse mais específico e para isso,
 * colocarei a classe  como abstrata (que não poderá ser estanciada.
 * Esse new Employee não poderá existir mais, a classe abstrata servirá como modelo,
 * somente poderão ser instanciados objetos do tipo das subclasses: gerente, desenvolvedor,
 * e todas as outras que herdarem de funcionário. Não vou poder criar de forma generalista
 * um funcionário, indicando o construtor new funcionário, por exemplo.
 */
public abstract class Employee {
    // Vou colocar protected para dar acesso para as classes filhas
    // sem usar os métodos accessors getter e setter
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //Method Exibir Informações
    public void DisplayInformation() {
        System.out.printf("\nFuncionário %s - Salário: %.2f", name, salary);
    }

    //Method Reajustar Salário
    public void adjustSalary(double percentage) {
        salary += salary * (percentage / 100);
        System.out.printf("\nNovo salário de %s é %.2f", name, salary);
    }
    /*
     *  Polimorfismo de sobrecarga
     *  Vou ter métodos com o mesmo nome, porém com assinaturas diferentes para que o java entenda
     *  qual method chamar conforme a assinatura.
     *  nesse method abaixo vou repetir o method adjustSalary, mas sem passar argumentos
     */
    public void adjustSalary() {
        salary += 500;
        System.out.printf("\nSalário com dissídio de %s é %.2f ",
                name, salary);
    }
    /* METHOD ABSTRATO (Obrigatóriamente Tem que ser implementado pelas subclasses)
     * Já o method abstrato posso criar, por exemplo: suponhamos que eu queira definir um
     * pagamento de PLR para cada tipo de funcionário. Vou criar um method abstrato sem {}
     * public abstract void calculatePLR();que só pode ser implementado pelas classes filhas.
     * Ele é apenas uma assinatura do method.
     * a Classe desenvolvedora nesse ponto, após a criação do method abstrato, já vai apresentar
     * erro avisando que vou ter que implementar esse method.
     */
    public abstract void calculatePLR();
}

