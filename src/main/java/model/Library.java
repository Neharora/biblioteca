package model;

import java.util.HashSet;
import java.util.Set;

public class Library {

    private static final String WELCOME_MESSAGE = "Welcome to library pathshala";
    private Set<Book> bookSet;

    public Library(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public Set<String> getTitleList() {
        Set<String> bookTitles = new HashSet<>();
        bookSet.forEach(book -> bookTitles.add(book.getString()));
        return bookTitles;
    }
}
