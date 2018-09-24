package controller;

import model.Library;
import view.InputDriver;
import view.OutputDriver;

import static main.Constants.MENU_WITHOUT_LOGIN;
import static main.Constants.RE_ENTER_YOUR_CHOICE;

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

    public void askChoiceAndProceed() {
        outputDriver.print(MENU_WITHOUT_LOGIN);
        int choice;
        do {
            choice = inputDriver.askIntegerChoice() - 1;
            if (choice >= 0 && choice < MenuBeforeLogin.values().length) {
                MenuBeforeLogin.values()[choice].proceed(outputDriver, library, inputDriver);
//                return;
            } else {
                outputDriver.print(RE_ENTER_YOUR_CHOICE);
            }
            outputDriver.print(MENU_WITHOUT_LOGIN);
        } while (choice != 1);
    }
}
