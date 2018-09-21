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

        assertEquals("Welcome to library pathshala\n", library.getWelcomeMessage());
    }

    @DisplayName("Test to get the print list of books from library")
    @Test
    void testForPrintingListOfBooks() {

        assertEquals(new Helper().getDeatilsOfBooks(), library.getList());
    }

    @DisplayName("Test to remove a book expects true if removed")
    @Test
    void testForRemovingBook() {

        assertEquals("Thank you! Enjoy the book.\n", library.removeBookFromList("SECOND TITLE"));
        assertEquals("That book is not available.\n", library.removeBookFromList("SECOND TITLE"));
    }

    @DisplayName("Test to add a book expects true if added")
    @Test
    void testForAddingBook() {

        library.removeBookFromList("SECOND TITLE");

        assertEquals("Thank you for returning the book.\n", library.addBookToList("SECOND TITLE"));
        assertEquals("That is not a valid book to return.\n", library.addBookToList("SIXTH TITLE"));
    }
}
