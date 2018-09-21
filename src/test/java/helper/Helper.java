package helper;

import model.Book;
import model.Library;

import java.util.ArrayList;
import java.util.List;

public class Helper {
    public Library returnLibrary() {
        return new Library(returnBookSet());
    }

    public List<Book> returnBookSet() {
        List<Book> bookSet = new ArrayList<>();
        Book book1 = new Book("FIRST TITLE", "neha", 2018);
        Book book2 = new Book("SECOND TITLE", "neha", 2018);
        Book book3 = new Book("THIRD TITLE", "neha", 2018);
        Book book4 = new Book("FOURTH TITLE", "neha", 2018);
        Book book5 = new Book("FIFTH TITLE", "neha", 2018);
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        return bookSet;
    }

    public List<String> getDeatilsOfBooks() {
        List<String> stringSet = new ArrayList<>();
        String title1 = "\n|    FIRST TITLE              |    neha      |    2018      |";
        String title2 = "\n|    SECOND TITLE             |    neha      |    2018      |";
        String title3 = "\n|    THIRD TITLE              |    neha      |    2018      |";
        String title4 = "\n|    FOURTH TITLE             |    neha      |    2018      |";
        String title5 = "\n|    FIFTH TITLE              |    neha      |    2018      |";
        stringSet.add(title1);
        stringSet.add(title2);
        stringSet.add(title3);
        stringSet.add(title4);
        stringSet.add(title5);
        return stringSet;
    }
}
