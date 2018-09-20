package controller;

import model.Book;
import model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.OutputDriver;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class LibraryControllerTest {
    private OutputDriver outputDriver;
    private LibraryController libraryController;

    @BeforeEach
    void init() {
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("First Title");
        Book book2 = new Book("Second Title");
        bookSet.add(book1);
        bookSet.add(book2);
        Library library = new Library(bookSet);
        outputDriver = mock(OutputDriver.class);
        libraryController = new LibraryController(outputDriver, library);
    }

    @DisplayName("test for printing the welcome message")
    @Test
    void testForPrint() {
        libraryController.printMessage();
        verify(outputDriver).print("Welcome to library pathshala");
    }

    @DisplayName("Test for printing the list of books")
    @Test
    void testForPrintingBooks() {
        libraryController.printListOfBooks();
        verify(outputDriver).print("First Title");
        verify(outputDriver).print("Second Title");
    }
}