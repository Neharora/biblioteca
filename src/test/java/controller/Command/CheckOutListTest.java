package controller.Command;

import model.ItemType;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static org.mockito.Mockito.*;

class CheckOutListTest {
    private CheckOutList checkOutList;
    private Library library;
    private InputDriver inputDriver;
    private OutputDriver outputDriver;

    @BeforeEach
    void init() {
        checkOutList = new CheckOutList();
        library = mock(Library.class);
        inputDriver = mock(InputDriver.class);
        outputDriver = mock(OutputDriver.class);
    }

    @DisplayName("Test for check out command for movie")
    @Test
    void testForCheckOutMovie() {
        ItemType itemType = ItemType.MOVIE;
        when(inputDriver.askInputAsString()).thenReturn("AVENGERS");
        when(library.removeItemFromList("AVENGERS", itemType)).thenReturn("Thank you! Enjoy the item.\n");

        checkOutList.action(outputDriver, library, inputDriver, itemType);

        verify(outputDriver).print("Thank you! Enjoy the item.\n");
    }

    @DisplayName("Test for check out command for book")
    @Test
    void testForCheckOutBook() {
        ItemType itemType = ItemType.BOOK;
        when(inputDriver.askInputAsString()).thenReturn("FIRST TITLE");
        when(library.removeItemFromList("FIRST TITLE", itemType)).thenReturn("That item is not available.\n");

        checkOutList.action(outputDriver, library, inputDriver, itemType);

        verify(outputDriver).print("That item is not available.\n");
    }

}