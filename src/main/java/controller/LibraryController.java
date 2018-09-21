package controller;

import model.Library;
import view.InputDriver;
import view.OutputDriver;

public class LibraryController {
    private final String RE_ENTER_MESSAGE = "Re-enter Your Choice !";
    private final String HORIZONTAL_LINE = " ============================================================";
    private final String MENU = "\nChoose a option \n1. List Books\n2.Checkout a book\n3.Quit";
    private final OutputDriver outputDriver;
    private Library library;
    private final InputDriver inputDriver;

    public LibraryController(final OutputDriver outputDriver, final Library library, final InputDriver inputDriver) {
        this.outputDriver = outputDriver;
        this.library = library;
        this.inputDriver = inputDriver;
    }

    public void printMessage() {
        outputDriver.print(library.getWelcomeMessage());
    }

    void printListOfBooks() {
        outputDriver.print(HORIZONTAL_LINE);
        library.getList().forEach(outputDriver::print);
        outputDriver.print("\n"+HORIZONTAL_LINE);
    }

    public boolean askChoiceAndProceed() {
        int choice = inputDriver.askChoice() - 1;
        if (choice >= 0 && choice <= 2) {
            return Menu.values()[choice].proceed(this);
        }
        outputDriver.print(RE_ENTER_MESSAGE);
        return false;
    }

    public void printMenu() {
        outputDriver.print(MENU);
    }

    void removeBook() {
        String bookToCheckout = inputDriver.askForBookToCheckout();
        outputDriver.print(library.removeBookFromList(bookToCheckout));
    }
}
