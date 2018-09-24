package main;

import controller.LibraryController;
import model.Library;
import view.InputDriver;
import view.OutputDriver;


public class BibliotecaApplication {

    public static void main(String ar[]) {
        Library library = new Library(new DefaultData().getDefaultList());
        LibraryController libraryController = new LibraryController(new OutputDriver(), library, new InputDriver());
        libraryController.printMessage();
        libraryController.askChoiceAndProceed();
    }
}
