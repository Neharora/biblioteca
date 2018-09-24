package controller;

import helper.Helper;
import model.Library;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static main.Constants.STRING_FORMATTER_BOOK;
import static org.mockito.Mockito.*;

class MenuBeforeLoginTest {
    @Test
    void testToLogin() {
        Library library = new Library(new Helper().returnSetOfItems());
        OutputDriver outputDriver = mock(OutputDriver.class);
        InputDriver inputDriver = mock(InputDriver.class);

        when(inputDriver.askIntegerChoice()).thenReturn(1234567).thenReturn(1).thenReturn(8);
        when(inputDriver.askInputAsString()).thenReturn("Nehar");

        MenuBeforeLogin.LOGIN.proceed(outputDriver, library, inputDriver);

        verify(inputDriver, times(3)).askIntegerChoice();
        verify(inputDriver).askInputAsString();
        verify(outputDriver).print(String.format(STRING_FORMATTER_BOOK, "FIRST TITLE", "neha", 2018));
    }

}