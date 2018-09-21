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
        return String.format("\n|    %-25s|    %-10s|    %-10s|", title, author, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        System.out.println(year == book.year &&
                title.equals(book.title) &&
                author.equals(book.author));
        return year == book.year &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    boolean isSameTitle(String bookToCheckout) {
        return this.title.equals(bookToCheckout);
    }

    String getTitleName() {
        return title;
    }
}
