package model;

import helper.Helper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {
    private Library library;


    @BeforeEach
    void init() {
        library = new Helper().returnLibrary();
    }

    @DisplayName("Test to get the getWelcomeMessage from biblioteca")
    @Test
    void testForWelcomeMessage() {

        assertEquals("Welcome to library pathshala", library.getWelcomeMessage());
    }

    @DisplayName("Test to get the print list of books from library")
    @Test
    void testForPrintingListOfBooks() {

        assertEquals(new Helper().getDeatilsOfBooks(), library.getTitleList());
    }

    @DisplayName("Test to remove a book expects true if removed")
    @Test
    void testForRemovingBook() {

        assertEquals("SECOND TITLE", library.removeBookFromList("SECOND TITLE"));
        assertEquals("Sorry No Such Book", library.removeBookFromList("SECOND TITLE"));
    }
}
