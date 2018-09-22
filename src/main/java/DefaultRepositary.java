import model.Book;
import model.ItemType;
import model.LibraryItem;
import model.Movie;

import java.util.ArrayList;
import java.util.List;

class DefaultRepositary {
    private List<LibraryItem> defaultBooks;

    DefaultRepositary() {
        this.defaultBooks = new ArrayList<>();
    }

    List<LibraryItem> getDefaultList() {
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
        defaultBooks.add(book1);
        defaultBooks.add(book2);
        defaultBooks.add(book3);
        defaultBooks.add(book4);
        defaultBooks.add(book5);
        defaultBooks.add(movie);
        defaultBooks.add(movie1);
        defaultBooks.add(movie2);
        defaultBooks.add(movie3);
        defaultBooks.add(movie4);
        return defaultBooks;
    }
}
