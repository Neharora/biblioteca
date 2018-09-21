import model.Book;

import java.util.ArrayList;
import java.util.List;

class BookRepositary {
    private List<Book> defaultBooks;

    BookRepositary() {
        this.defaultBooks = new ArrayList<>();
    }

    List<Book> getDefaultBooks() {
        Book book1 = new Book("FIRST TITLE", "neha", 2018);
        Book book2 = new Book("SECOND TITLE", "neha", 2018);
        Book book3 = new Book("THIRD TITLE", "neha", 2018);
        Book book4 = new Book("FOURTH TITLE", "neha", 2018);
        Book book5 = new Book("FIFTH TITLE", "neha", 2018);
        defaultBooks.add(book1);
        defaultBooks.add(book2);
        defaultBooks.add(book3);
        defaultBooks.add(book4);
        defaultBooks.add(book5);
        return defaultBooks;
    }
}
