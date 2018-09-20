package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {
    private Library library;


    @BeforeEach
    void init() {
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("First Title");
        Book book2 = new Book("Second Title");
        bookSet.add(book1);
        bookSet.add(book2);
        library = new Library(bookSet);
    }

    @DisplayName("Test to get the getWelcomeMessage from biblioteca")
    @Test
    void testForWelcomeMessage() {

        assertEquals("Welcome to library pathshala", library.getWelcomeMessage());
    }

    @DisplayName("Test to get the print list of books from library")
    @Test
    void testForPrintingListOfBooks() {
        Set<String> stringSet = new HashSet<>();
        String title1 = "First Title";
        String title2 = "Second Title";
        stringSet.add(title1);
        stringSet.add(title2);
        assertEquals(stringSet, library.getTitleList());
    }
}
