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

    public void askChoiceAndProceed() {
        switch (inputDriver.askChoice()){
            case 1:
                printListOfBooks();
            default:
                outputDriver.print("chosen wrong choice");
        }
    }
}
