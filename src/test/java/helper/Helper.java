package helper;

import model.Book;
import model.Library;

import java.util.HashSet;
import java.util.Set;

public class Helper {
    public Library returnLibrary() {
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("First Title", "neha", 2018);
        Book book2 = new Book("Second Title", "neha", 2018);
        bookSet.add(book1);
        bookSet.add(book2);
        return new Library(bookSet);
    }
}
