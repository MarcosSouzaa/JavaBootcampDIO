package br.com.dio.poo.model.exercicios;

/**
 * 1. Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter
 * as seguintes operações:
 * <p>
 * - Dar banho no pet;
 * - Abastecer com água;
 * - Abastecer com shampoo;
 * - verificar nível de água;
 * - verificar nível de shampoo;
 * - verificar se tem pet no banho;
 * - colocar pet na maquina;
 * - retirar pet da máquina;
 * - limpar maquina.
 * <p>
 * Siga as seguintes regras para implementação
 * <p>
 * - A maquina de banho deve permitir somente 1 pet por vez;
 * - Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
 * - A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
 * - Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada
 * de outro pet;
 * - A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
 * - O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;
 */
public class PetMachine {
    private int waterLevel = 0;
    private int shampooLevel = 0;
    private boolean isDirty = false;
    private Pet pet; // Composição: a máquina contém um objeto Pet

    public PetMachine() {
        // Construtor vazio inicializa com valores padrão
    }

    public void addWater() {
        if (this.waterLevel + 2 <= 30) {
            this.waterLevel += 2;
            System.out.println("Água adicionada. Nível atual: " + waterLevel + "L");
        } else {
            System.out.println("Tanque de água cheio (30L)");
        }
    }

    public void addShampoo() {
        if (this.shampooLevel + 2 <= 10) {
            this.shampooLevel += 2;
            System.out.println("Xampu adicionado. Nível atual: " + shampooLevel + "L");
        } else {
            System.out.println("Tanque de xampu cheio (10L)");
        }
    }

    public void setPetInMachine(Pet pet) {
        if (this.pet == null && !isDirty) {
            this.pet = pet;
            System.out.println("O pet " + pet.getName() + " entrou na máquina.");
        } else if (isDirty) {
            System.out.println("Máquina suja! Limpe-a antes.");
        } else {
            System.out.println("Já existe um pet lá dentro.");
        }
    }

    public void washPet() {
        if (this.pet != null && waterLevel >= 10 && shampooLevel >= 2) {
            this.waterLevel -= 10;
            this.shampooLevel -= 2;
            this.pet.setClean(true); // Alteramos o estado do OBJETO Pet
            System.out.println("Banho terminado! " + pet.getName() + " está limpo.");
        } else if (this.pet == null) {
            System.out.println("Coloque um pet na máquina primeiro.");
        } else {
            System.out.println("Recursos insuficientes (Necessário 10L Água / 2L Xampu).");
        }
    }

    public void takePetOut() {
        if (this.pet != null) {
            String name = this.pet.getName();
            this.isDirty = true; // Retirar o pet sempre suja a máquina
            this.pet = null; // A máquina agora está vazia
            System.out.println("O pet " + name + " foi retirado. Máquina precisa de limpeza.");
        } else {
            System.out.println("Não há pet para retirar.");
        }
    }

    public void cleanMachine() {
        if (waterLevel >= 3 && shampooLevel >= 1) {
            this.waterLevel -= 3;
            this.shampooLevel -= 1;
            this.isDirty = false;
            System.out.println("A máquina foi limpa.");
        } else {
            System.out.println("Recursos insuficientes para limpeza (3L Água / 1L Xampu).");
        }
    }

    // Getters atualizados
    public int getWaterLevel() {
        return waterLevel;
    }

    public int getShampooLevel() {
        return shampooLevel;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean hasPetInside() {
        return this.pet != null;
    }

    public Pet getPet() {
        return pet;
    }
}
