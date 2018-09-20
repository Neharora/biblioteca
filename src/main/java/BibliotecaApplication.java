import controller.LibraryController;
import model.Book;
import model.Library;
import view.OutputDriver;

import java.util.HashSet;
import java.util.Set;

public class BibliotecaApplication {
    public static void main(String ar[]) {
        Library library = new Library(getDefaultBooks());
        LibraryController libraryController = new LibraryController(new OutputDriver(), library);
        libraryController.printMessage();
        libraryController.printListOfBooks();
    }

    private static Set<Book> getDefaultBooks() {
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("FIRST TITLE");
        Book book2 = new Book("SECOND TITLE");
        Book book3 = new Book("THIRD TITLE");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        return bookSet;
    }
}
