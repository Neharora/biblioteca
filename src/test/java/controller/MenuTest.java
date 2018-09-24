package controller;

import helper.Helper;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static main.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
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

        menu.proceed(outputDriver, library, inputDriver);

        verify(outputDriver).print(String.format(STRING_FORMATTER_BOOK, "FIRST TITLE", "neha", 2018));
    }

    @DisplayName("test for calling proceed on check in for book")
    @Test
    void testForCheckIn() {
        Menu menu = Menu.CHECK_IN_BOOK;
        when(inputDriver.askInputAsString()).thenReturn("FIRST TITLE");

        menu.proceed(outputDriver, library, inputDriver);

        verify(inputDriver).askInputAsString();
        verify(outputDriver).print(ENTER_ITEM_NAME);
        verify(outputDriver).print(UNSUCCESS_MESSAGE_FOR_CHECKIN);
    }

    @DisplayName("test for calling proceed on checkout for book")
    @Test
    void testForCheckoutBook() {

        Menu menu = Menu.CHECKOUT_BOOKS;
        when(inputDriver.askInputAsString()).thenReturn("FIRST TITLE").thenReturn("FIRST TITLE");

        menu.proceed(outputDriver, library, inputDriver);
        menu.proceed(outputDriver, library, inputDriver);

        verify(outputDriver).print(SUCCESS_MESSAGE_FOR_CHECKOUT);
        verify(outputDriver).print(UNSUCCESS_MESSAGE_FOR_CHECKOUT);
    }

    @DisplayName("test for checking functionality of remove movie")
    @Test
    void testForCheckingRemoveBookFunction() {

        Menu menu = Menu.CHECKOUT_MOVIES;


        when(inputDriver.askInputAsString()).thenReturn("AVENGERS").thenReturn("AVENGERS");

        menu.proceed(outputDriver, library, inputDriver);
        menu.proceed(outputDriver, library, inputDriver);

        verify(outputDriver).print(SUCCESS_MESSAGE_FOR_CHECKOUT);
        verify(outputDriver).print(UNSUCCESS_MESSAGE_FOR_CHECKOUT);
    }

    @DisplayName("test for checking functionality of add movie")
    @Test
    void testForCheckingAddBookFunction() {

        Menu menu = Menu.CHECK_IN_MOVIES;

        when(inputDriver.askInputAsString()).thenReturn("AVENGERS");

        menu.proceed(outputDriver, library, inputDriver);

        verify(inputDriver).askInputAsString();
        verify(outputDriver).print(ENTER_ITEM_NAME);
        verify(outputDriver).print(UNSUCCESS_MESSAGE_FOR_CHECKIN);
    }

    @DisplayName("test to get user information expects user is not logged in")
    @Test
    void testToGetUserDetails() {
        assertEquals(USER_IS_NOT_LOGGED_IN, library.getInformationAboutCurrentUser());
    }

}