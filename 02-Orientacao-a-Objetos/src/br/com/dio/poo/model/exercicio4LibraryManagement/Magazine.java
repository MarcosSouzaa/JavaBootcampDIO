package br.com.dio.poo.model.exercicio4LibraryManagement;

public class Magazine extends Media{
    private int edition;

    public Magazine(String title, int yearOfPublication, int edition) {
        super(title, yearOfPublication);
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }

    public void displayInformation(){
        System.out.println("Código: " + generateCode() + " | Revista: \"" + getTitle() + "\" - Edição: " + edition);
    }
}