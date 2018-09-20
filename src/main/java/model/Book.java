package model;

public class Book {
    private final String title;
    private final String author;
    private final int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    String getString() {
        return "\n" + title + "---" + author + "---" + year;
    }

}