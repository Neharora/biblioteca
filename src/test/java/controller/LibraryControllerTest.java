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

        verify(outputDriver).print("Welcome to library pathshala\n");
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
        when(inputDriver.askChoice()).thenReturn(9);

        libraryController.askChoiceAndProceed();

        verify(inputDriver).askChoice();
        verify(outputDriver).print("Re-enter Your Choice !\n");
    }

    @DisplayName("test for printing the menu")
    @Test
    void testForPrinting() {
        libraryController.printMenu();

        verify(outputDriver).print("\nChoose a option \n1. List Books\n2.List Movies\n3.Checkout book\n4.Return book\n5.Checkout Movie\n6.Return movie\n7.Quit\n");
    }
}