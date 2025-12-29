package br.com.dio.poo.model.exercicio4LibraryManagement;

public class Media {
    private String title;
    private int yearOfPublication;

    public Media(String title, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String generateCode () {
        return "LIB - " + title.substring(0, 3) + yearOfPublication;
    }
}
