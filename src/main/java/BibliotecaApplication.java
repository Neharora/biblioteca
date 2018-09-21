import controller.LibraryController;
import model.Library;
import view.InputDriver;
import view.OutputDriver;


public class BibliotecaApplication {

    public static void main(String ar[]) {
        Library library = new Library(new BookRepositary().getDefaultBooks());
        LibraryController libraryController = new LibraryController(new OutputDriver(), library, new InputDriver());
        libraryController.printMessage();
        libraryController.printMenu();
        boolean menuLoop = libraryController.askChoiceAndProceed();
        while (!menuLoop) {
            menuLoop = libraryController.askChoiceAndProceed();
        }
    }
}
