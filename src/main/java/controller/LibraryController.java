package controller;

import model.Library;
import view.InputDriver;
import view.OutputDriver;

public class LibraryController {
    private final OutputDriver outputDriver;
    private Library library;
    private final InputDriver inputDriver;

    public LibraryController(final OutputDriver outputDriver,final Library library,final InputDriver inputDriver) {
        this.outputDriver = outputDriver;
        this.library = library;
        this.inputDriver = inputDriver;
    }

    public void printMessage() {
        outputDriver.print(library.getWelcomeMessage());
    }

    void printListOfBooks() {
        library.getTitleList().forEach(outputDriver::print);
    }

    public boolean askChoiceAndProceed() {
        switch (inputDriver.askChoice()){
            case 1:
            {
                printListOfBooks();
                return true;
            }
            default:
            {
                outputDriver.print("Select a valid option!");
                return false;
            }
        }
    }

    public void printMenu() {
        outputDriver.print("\nChoose a option \n1. List Books");
    }
}
