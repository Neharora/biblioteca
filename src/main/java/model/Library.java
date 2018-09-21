package model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static final String WELCOME_MESSAGE = "Welcome to library pathshala";
    private static final String SUCCESS_MESSAGE_FOR_CEHECKOUT = "Thank you! Enjoy the book.";
    private static final String UNSUCCESS_MESSAGE_FOR_CEHECKOUT = "That book is not available.";
    private List<Book> bookSet;

    public Library(List<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public List<String> getList() {
        List<String> bookTitles = new ArrayList<>();
        bookSet.forEach(book -> bookTitles.add(book.getString()));
        return bookTitles;
    }

    public String removeBookFromList(String bookToCheckout) {
        for (Book aBookSet : bookSet) {
            if (aBookSet.isSameTitle(bookToCheckout)) {
                bookSet.remove(aBookSet);
                return SUCCESS_MESSAGE_FOR_CEHECKOUT;
            }
        }
        return UNSUCCESS_MESSAGE_FOR_CEHECKOUT;
    }
}
