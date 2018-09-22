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

    public boolean askChoiceAndProceed() {
        int choice = inputDriver.askChoice() - 1;
        if (choice >= 0 && choice <= 6) {
            return Menu.values()[choice].proceed(outputDriver, library, inputDriver);
        }
        String RE_ENTER_MESSAGE = "Re-enter Your Choice !\n";
        outputDriver.print(RE_ENTER_MESSAGE);
        return false;
    }

    public void printMenu() {
        String MENU = "\nChoose a option \n1. List Books\n2.List Movies\n3.Checkout book\n4.Return book\n5.Checkout Movie\n6.Return movie\n7.Quit\n";
        outputDriver.print(MENU);
    }

}
