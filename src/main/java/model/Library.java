package model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static final String WELCOME_MESSAGE = "Welcome to library pathshala\n";
    private static final String SUCCESS_MESSAGE_FOR_CHECKOUT = "Thank you! Enjoy the book.\n";
    private static final String UNSUCCESS_MESSAGE_FOR_CHECKOUT = "That book is not available.\n";
    private static final String SUCCESS_MESSAGE_FOR_CHECKIN = "Thank you for returning the book.\n";
    private static final String UNSUCCESS_MESSAGE_FOR_CHECKIN = "That is not a valid book to return.\n";
    private List<Book> presentBookSet;
    private List<Book> checkedOutBooks;


    public Library(List<Book> presentBookSet) {
        this.checkedOutBooks = new ArrayList<>();
        this.presentBookSet = presentBookSet;
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public List<String> getList() {
        List<String> bookTitles = new ArrayList<>();
        presentBookSet.forEach(book -> bookTitles.add(book.getString()));
        return bookTitles;
    }

    public String removeBookFromList(String bookToCheckout) {
        for (Book aBookSet : presentBookSet) {
            if (aBookSet.isSameTitle(bookToCheckout)) {
                presentBookSet.remove(aBookSet);
                checkedOutBooks.add(aBookSet);
                return SUCCESS_MESSAGE_FOR_CHECKOUT;
            }
        }
        return UNSUCCESS_MESSAGE_FOR_CHECKOUT;
    }

   public String addBookToList(String bookToCheckIn) {
        for(Book book : checkedOutBooks) {
            if(book.isSameTitle(bookToCheckIn)) {
                checkedOutBooks.remove(book);
                presentBookSet.add(book);
                return SUCCESS_MESSAGE_FOR_CHECKIN;
            }
        }
        return UNSUCCESS_MESSAGE_FOR_CHECKIN;
   }
}
