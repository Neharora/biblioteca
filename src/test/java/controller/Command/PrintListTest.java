package controller.Command;

import helper.Helper;
import model.ItemType;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputDriver;
import view.OutputDriver;

import static main.Constants.STRING_FORMATTER_BOOK;
import static main.Constants.STRING_FORMATTER_MOVIE;
import static org.mockito.Mockito.*;

class PrintListTest {
    private PrintList printList;
    private Library library;
    private InputDriver inputDriver;
    private OutputDriver outputDriver;

    @BeforeEach
    void init() {
        printList = new PrintList();
        library = mock(Library.class);
        inputDriver = mock(InputDriver.class);
        outputDriver = mock(OutputDriver.class);
    }

    @DisplayName("test to print the list of books")
    @Test
    void testToPrintBooks() {
        when(library.getList(ItemType.BOOK)).thenReturn(new Helper().getDetailsOfBooks());

        printList.action(outputDriver, library, inputDriver, ItemType.BOOK);

        verify(outputDriver).print(String.format(STRING_FORMATTER_BOOK, "FIRST TITLE", "neha", 2018));
    }

    @DisplayName("test to print the list of movies")
    @Test
    void testToPrintMovies() {
        when(library.getList(ItemType.MOVIE)).thenReturn(new Helper().getDetailsOfMovies());

        printList.action(outputDriver, library, inputDriver, ItemType.MOVIE);

        verify(outputDriver).print(String.format(STRING_FORMATTER_MOVIE, "AVENGERS", "neha", 2018, 8));
    }
}