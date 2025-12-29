package br.com.dio.poo.model.exercicio4LibraryManagement;

public class Ebook extends Media {

   private String format;

    public Ebook(String title, int yearOfPublication, String format ) {
        super(title, yearOfPublication);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
    public void displayInformation() {
        System.out.println("Código: " + generateCode() + " | Ebook: \"" + getTitle() + "\" - Formato: " + format);
    }
}
