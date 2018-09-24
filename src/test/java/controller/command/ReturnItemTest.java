package controller.command;

import model.ItemType;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static org.mockito.Mockito.*;

class ReturnItemTest {
    private ReturnItem returnItem;
    private Library library;
    private InputDriver inputDriver;
    private OutputDriver outputDriver;

    @BeforeEach
    void init() {
        returnItem = new ReturnItem();
        library = mock(Library.class);
        inputDriver = mock(InputDriver.class);
        outputDriver = mock(OutputDriver.class);
    }

    @DisplayName("Test for check in command for movie")
    @Test
    void testForCheckInMovie() {
        ItemType itemType = ItemType.MOVIE;
        when(inputDriver.askInputAsString()).thenReturn("AVENGERS");
        when(library.addItemToList("AVENGERS", itemType)).thenReturn("That is not a valid item to return.\n");

        returnItem.action(outputDriver, library, inputDriver, itemType);

        verify(outputDriver).print("That is not a valid item to return.\n");
    }

    @DisplayName("Test for check in command for book")
    @Test
    void testForCheckInBook() {
        ItemType itemType = ItemType.BOOK;
        when(inputDriver.askInputAsString()).thenReturn("FIRST TITLE");
        when(library.addItemToList("FIRST TITLE", itemType)).thenReturn("Thank you for returning the item.\n");

        returnItem.action(outputDriver, library, inputDriver, itemType);

        verify(outputDriver).print("Thank you for returning the item.\n");
    }

}