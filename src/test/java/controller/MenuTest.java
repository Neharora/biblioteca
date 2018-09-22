package controller;

import helper.Helper;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

class MenuTest {
    private Library library;
    private OutputDriver outputDriver;
    private InputDriver inputDriver;


    @BeforeEach
    void init() {
        library = new Helper().returnLibrary();
        outputDriver = mock(OutputDriver.class);
        inputDriver = mock(InputDriver.class);
    }

    @DisplayName("test for calling proceed on print books")
    @Test
    void testForPrintBooks() {
        Menu menu = Menu.PRINT_BOOKS;

        boolean returnType = menu.proceed(outputDriver, library, inputDriver);

        assertFalse(returnType);
        verify(outputDriver).print("\n|    FIRST TITLE              |    neha      |    2018      |");
        verify(outputDriver).print("\n|    FIFTH TITLE              |    neha      |    2018      |");
    }

    @DisplayName("test for calling proceed on check in for book")
    @Test
    void testForCheckIn() {
        Menu menu = Menu.CHECK_IN_BOOK;
        when(inputDriver.askForItemName()).thenReturn("FIRST TITLE");

        boolean returnType = menu.proceed(outputDriver, library, inputDriver);

        assertFalse(returnType);
        verify(inputDriver).askForItemName();
        verify(outputDriver).print("Enter Book Name : ");
        verify(outputDriver).print("That is not a valid item to return.\n");
    }

    @DisplayName("test for calling proceed on checkout for book")
    @Test
    void testForCheckoutBook() {

        Menu menu = Menu.CHECKOUT_BOOKS;
        when(inputDriver.askForItemName()).thenReturn("FIRST TITLE").thenReturn("FIRST TITLE");

        boolean returnType = menu.proceed(outputDriver, library, inputDriver);
        menu.proceed(outputDriver, library, inputDriver);

        assertFalse(returnType);
        verify(outputDriver).print("Thank you! Enjoy the item.\n");
        verify(outputDriver).print("That item is not available.\n");
    }

    @DisplayName("test for checking functionality of remove movie")
    @Test
    void testForCheckingRemoveBookFunction() {

        Menu menu = Menu.CHECKOUT_MOVIES;


        when(inputDriver.askForItemName()).thenReturn("AVENGERS").thenReturn("AVENGERS");

        boolean returnType = menu.proceed(outputDriver, library, inputDriver);
        menu.proceed(outputDriver, library, inputDriver);

        assertFalse(returnType);
        verify(outputDriver).print("Thank you! Enjoy the item.\n");
        verify(outputDriver).print("That item is not available.\n");
    }

    @DisplayName("test for checking functionality of add movie")
    @Test
    void testForCheckingAddBookFunction() {

        Menu menu = Menu.CHECK_IN_MOVIES;

        when(inputDriver.askForItemName()).thenReturn("AVENGERS");

        boolean returnType = menu.proceed(outputDriver, library, inputDriver);

        assertFalse(returnType);
        verify(inputDriver).askForItemName();
        verify(outputDriver).print("Enter Movie Name : ");
        verify(outputDriver).print("That is not a valid item to return.\n");
    }

}