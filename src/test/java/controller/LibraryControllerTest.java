package controller;

import helper.Helper;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static main.Constants.ENTER_USER_DETAILS;
import static main.Constants.RE_ENTER_YOUR_CHOICE;
import static main.Constants.STRING_FORMATTER_BOOK;
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
        when(inputDriver.askIntegerChoice()).thenReturn(1).thenReturn(1234567).thenReturn(1).thenReturn(8);
        when(inputDriver.askInputAsString()).thenReturn("Nehar");

        libraryController.askChoiceAndProceed();

        verify(inputDriver,times(4)).askIntegerChoice();
        verify(outputDriver).print(ENTER_USER_DETAILS);
        verify(inputDriver).askInputAsString();
        verify(outputDriver).print(String.format(STRING_FORMATTER_BOOK,"FIRST TITLE","neha",2018));
    }


    @DisplayName("Test for taking the input as wrong choice")
    @Test
    void testForAskingInput5() {
        when(inputDriver.askIntegerChoice()).thenReturn(5).thenReturn(2);

        libraryController.askChoiceAndProceed();

        verify(inputDriver,times(2)).askIntegerChoice();
        verify(outputDriver).print(RE_ENTER_YOUR_CHOICE);
    }

}