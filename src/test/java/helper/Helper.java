package helper;

import model.*;
import org.junit.jupiter.api.Disabled;

import java.util.ArrayList;
import java.util.List;

@Disabled
public class Helper {
    public Library returnLibrary() {
        return new Library(returnSetOfItems());
    }

    public List<LibraryItem> returnSetOfItems() {
        List<LibraryItem> bookSet = new ArrayList<>();
        Book book1 = new Book("FIRST TITLE", "neha", 2018, ItemType.BOOK);
        Book book2 = new Book("SECOND TITLE", "neha", 2018, ItemType.BOOK);
        Book book3 = new Book("THIRD TITLE", "neha", 2018, ItemType.BOOK);
        Book book4 = new Book("FOURTH TITLE", "neha", 2018, ItemType.BOOK);
        Book book5 = new Book("FIFTH TITLE", "neha", 2018, ItemType.BOOK);
        Movie movie = new Movie("AVENGERS", "neha", 2018, ItemType.MOVIE, 8);
        Movie movie1 = new Movie("SECOND TITLE", "neha", 2018, ItemType.MOVIE, 8);
        Movie movie2 = new Movie("THIRD TITLE", "neha", 2018, ItemType.MOVIE, 7);
        Movie movie3 = new Movie("FOURTH TITLE", "neha", 2018, ItemType.MOVIE, 6);
        Movie movie4 = new Movie("FIFTH TITLE", "neha", 2018, ItemType.MOVIE, 8);
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(movie);
        bookSet.add(movie1);
        bookSet.add(movie2);
        bookSet.add(movie3);
        bookSet.add(movie4);
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

    public List<String> getDeatilsOfMovies() {
        List<String> stringSet = new ArrayList<>();
        String title1 = "\n|    AVENGERS                 |    neha       |    2018       |    8 |";
        String title2 = "\n|    SECOND TITLE             |    neha       |    2018       |    8 |";
        String title3 = "\n|    THIRD TITLE              |    neha       |    2018       |    7 |";
        String title4 = "\n|    FOURTH TITLE             |    neha       |    2018       |    6 |";
        String title5 = "\n|    FIFTH TITLE              |    neha       |    2018       |    8 |";
        stringSet.add(title1);
        stringSet.add(title2);
        stringSet.add(title3);
        stringSet.add(title4);
        stringSet.add(title5);
        return stringSet;
    }
}
