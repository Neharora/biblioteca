package controller;

import helper.Helper;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class MenuTest {
    private LibraryController libraryController;

    @BeforeEach
    void init() {
        Library library = new Helper().returnLibrary();
        OutputDriver outputDriver = mock(OutputDriver.class);
        InputDriver inputDriver = mock(InputDriver.class);
        libraryController = new LibraryController(outputDriver, library, inputDriver);
    }

    @DisplayName("test for calling proceed on print books")
    @Test
    void testForPrintBooks() {
        Menu menu = Menu.PRINT_BOOKS;

        boolean returnType = menu.proceed(libraryController);

        assertFalse(returnType);
    }

    @DisplayName("test for calling proceed on quit")
    @Test
    void testForQuit() {
        Menu menu = Menu.QUIT;

        boolean returnType = menu.proceed(libraryController);

        assertTrue(returnType);
    }


    @DisplayName("test for calling proceed on checkout")
    @Test
    void testForCheckoutBook() {

        Menu menu = Menu.CHECKOUT;

        boolean returnType = menu.proceed(libraryController);

        assertFalse(returnType);
    }

    @DisplayName("test for calling proceed on print books")
    @Test
    void testForCheckingRemove() {

        Menu menu = Menu.CHECKOUT;
        LibraryController mockLibraryController = mock(LibraryController.class);
        menu.proceed(mockLibraryController);

        verify(mockLibraryController).removeBook();
    }

}