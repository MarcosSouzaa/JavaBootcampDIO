package br.com.dio.poo.model.exercicio4LibraryManagement;

public class Book extends Media {
      private String author;

    public Book(String title, int yearOfPublication, String author) {
        super(title, yearOfPublication);
        this.author = author;

    }

    public String getAuthor() {
        return author;
    }

    public void displayInformation(){

        System.out.println("Código: " + generateCode() + " | Livro: \"" + getTitle() + "\" - Autor: " + author);
    }
}
