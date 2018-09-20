package controller;

import helper.Helper;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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

        verify(outputDriver).print("\nFirst Title---neha---2018");
        verify(outputDriver).print("\nSecond Title---neha---2018");
    }

    @DisplayName("Test for taking the input")
    @Test
    void testForAskingInput() {
        libraryController.askChoiceAndProceed();

        verify(inputDriver).askChoice();
    }
}