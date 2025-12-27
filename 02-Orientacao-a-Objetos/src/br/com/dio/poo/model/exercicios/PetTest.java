package br.com.dio.poo.model.exercicios;

import java.util.Scanner;

public class PetTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetMachine machine = new PetMachine();
        int option;

        do {
            System.out.println("\n--- MENU PET SHOP ---");
            System.out.println("1. Colocar Pet | 2. Dar Banho | 3. Retirar Pet");
            System.out.println("4. Limpar Máquina | 5. Add Água | 6. Add Xampu");
            System.out.println("7. Status | 0. Sair");
            System.out.print("Escolha: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Nome do Pet: ");
                    String name = scanner.next();
                    Pet newPet = new Pet(name); // Criando o objeto Pet
                    machine.setPetInMachine(newPet);
                }
                case 2 -> machine.washPet();
                case 3 -> machine.takePetOut();
                case 4 -> machine.cleanMachine();
                case 5 -> machine.addWater();
                case 6 -> machine.addShampoo();
                case 7 -> {
                    System.out.println("Água: " + machine.getWaterLevel() + "L | Xampu: " + machine.getShampooLevel() + "L");
                    System.out.println("Máquina suja? " + (machine.isDirty() ? "Sim" : "Não"));
                    if (machine.hasPetInside()) {
                        System.out.println("Pet atual: " + machine.getPet().getName() +
                                " | Está limpo? " + (machine.getPet().isClean() ? "Sim" : "Não"));
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (option != 0);

        scanner.close();
    }
}