package controller;

import helper.Helper;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class MenuTest {
    private LibraryController libraryController;

    @BeforeEach
    void init() {
        Library library = new Helper().returnLibrary();
        OutputDriver outputDriver = mock(OutputDriver.class);
        InputDriver inputDriver = mock(InputDriver.class);
        libraryController = new LibraryController(outputDriver, library, inputDriver);
    }

    @Test
    void testForPrintBooks() {
        Menu menu = Menu.PRINT_BOOKS;

        boolean returnType = menu.proceed(libraryController);

        assertFalse(returnType);
    }

    @Test
    void testForQuit() {
        Menu menu = Menu.QUIT;

        boolean returnType = menu.proceed(libraryController);

        assertTrue(returnType);
    }

    @Test
    void testForDefault() {

        Menu menu = Menu.DEFAULT;

        boolean returnType = menu.proceed(libraryController);

        assertFalse(returnType);
    }


}