package controller;

import model.Library;
import view.OutputDriver;

public class LibraryController {
    private final OutputDriver outputDriver;
    private Library library;

    public LibraryController(OutputDriver outputDriver, Library library) {
        this.outputDriver = outputDriver;
        this.library = library;
    }

    public void printMessage() {
        outputDriver.print(library.getWelcomeMessage());
    }

    public void printListOfBooks() {
        library.getTitleList().forEach(outputDriver::print);
    }
}
