import controller.LibraryController;
import model.Book;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

import java.util.HashSet;
import java.util.Set;

public class BibliotecaApplication {

    public static void main(String ar[]) {
        Library library = new Library(getDefaultBooks());
        LibraryController libraryController = new LibraryController(new OutputDriver(), library,new InputDriver());
        libraryController.printMessage();
        libraryController.printMenu();
        boolean menuLoop = libraryController.askChoiceAndProceed();
        while(!menuLoop)
        {
            menuLoop = libraryController.askChoiceAndProceed();
        }
    }

    private static Set<Book> getDefaultBooks() {
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("FIRST TITLE", "neha", 2018);
        Book book2 = new Book("SECOND TITLE", "neha", 2018);
        Book book3 = new Book("THIRD TITLE", "neha", 2018);
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        return bookSet;
    }
}
