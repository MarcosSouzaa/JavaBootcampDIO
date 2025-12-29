package br.com.dio.poo.model.exercicio4LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Guia do Mochileiro das Galáxias", 1979, "Douglas Adams");
        Magazine magazine = new Magazine("National Geographic", 2023, 245);
        Ebook ebook = new Ebook("Clean Code", 2008, "PDF");

        book.displayInformation();
        magazine.displayInformation();
        ebook.displayInformation();
    }
}
