package controller.Command;

import model.ItemType;
import model.Library;
import model.UserId;
import model.UserPassword;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static org.mockito.Mockito.*;

class LoginCommandTest {
    @Test
    void testToLogin() {
        Library library = mock(Library.class);
        OutputDriver outputDriver = mock(OutputDriver.class);
        InputDriver inputDriver = mock(InputDriver.class);
        when(inputDriver.askIntegerChoice()).thenReturn(1234567).thenReturn(1).thenReturn(8);
        when(inputDriver.askInputAsString()).thenReturn("Nehar");
        when(library.isUserValid(new UserId(1234567), new UserPassword("Nehar"))).thenReturn(true);

        new LoginCommand().action(outputDriver, library, inputDriver, ItemType.BOOK);

        verify(inputDriver, times(3)).askIntegerChoice();
        verify(inputDriver).askInputAsString();
        verify(library).isUserValid(new UserId(1234567), new UserPassword("Nehar"));
    }

}