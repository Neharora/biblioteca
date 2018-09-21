package controller;

import helper.Helper;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static org.mockito.Mockito.*;

class LibraryControllerTest {
    private OutputDriver outputDriver;
    private InputDriver inputDriver;
    private LibraryController libraryController;

    @BeforeEach
    void init() {
        Library library = new Helper().returnLibrary();
        outputDriver = mock(OutputDriver.class);
        inputDriver = mock(InputDriver.class);
        libraryController = new LibraryController(outputDriver, library, inputDriver);
    }

    @DisplayName("test for printing the welcome message")
    @Test
    void testForPrint() {
        libraryController.printMessage();

        verify(outputDriver).print("Welcome to library pathshala");
    }

    @DisplayName("Test for printing the list of books")
    @Test
    void testForPrintingBooks() {
        libraryController.printListOfBooks();

        verify(outputDriver).print("\n|    FIRST TITLE              |    neha      |    2018      |");
        verify(outputDriver).print("\n|    SECOND TITLE             |    neha      |    2018      |");
    }

    @DisplayName("Test for taking the input as book list")
    @Test
    void testForAskingInput1() {
        when(inputDriver.askChoice()).thenReturn(1);

        libraryController.askChoiceAndProceed();

        verify(inputDriver).askChoice();
        verify(outputDriver).print("\n|    FIRST TITLE              |    neha      |    2018      |");
        verify(outputDriver).print("\n|    SECOND TITLE             |    neha      |    2018      |");
    }




    @DisplayName("Test for taking the input as wrong choice")
    @Test
    void testForAskingInput5() {
        when(inputDriver.askChoice()).thenReturn(5);

        libraryController.askChoiceAndProceed();

        verify(inputDriver).askChoice();
        verify(outputDriver).print("Re-enter Your Choice !");
    }

    @DisplayName("test for printing the menu")
    @Test
    void testForPrinting() {
        libraryController.printMenu();

        verify(outputDriver).print("\nChoose a option \n1. List Books\n2.Checkout a book\n3.Quit");
    }

    @DisplayName("test to checkout Book in the list")
    @Test
    void testForCheckingoutBookInList() {

        when(inputDriver.askForBookToCheckout()).thenReturn("FIRST TITLE");
        libraryController.removeBook();
        verify(inputDriver).askForBookToCheckout();
        verify(outputDriver).print("Thank you! Enjoy the book.");
    }

    @DisplayName("test to checkout Book not in the list")
    @Test
    void testForCheckingoutBookNotInList() {

        when(inputDriver.askForBookToCheckout()).thenReturn("SIXTH TITLE");
        libraryController.removeBook();
        verify(inputDriver).askForBookToCheckout();
        verify(outputDriver).print("That book is not available.");
    }
}