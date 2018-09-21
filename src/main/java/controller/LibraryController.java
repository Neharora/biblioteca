package controller;

import model.Library;
import view.InputDriver;
import view.OutputDriver;

public class LibraryController {
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
        outputDriver.print(" ============================================================");
        library.getTitleList().forEach(outputDriver::print);
        outputDriver.print("\n ============================================================");
    }

    public boolean askChoiceAndProceed() {
        int choice = inputDriver.askChoice() - 1;
        if (choice >= 0 && choice <= 2) {
            return Menu.values()[choice].proceed(this);
        }
        return Menu.values()[2].proceed(this);
    }

    public void printMenu() {
        outputDriver.print("\nChoose a option \n1. List Books\n2.Checkout a book\n3.Quit");
    }

    void removeBook() {
        String bookToCheckout = inputDriver.askForBookToCheckout();
        outputDriver.print(library.removeBookFromList(bookToCheckout));
    }
}
