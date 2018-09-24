package model;

import helper.Helper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static main.Constants.USER_IS_NOT_LOGGED_IN;
import static model.ItemType.BOOK;
import static model.ItemType.MOVIE;
import static org.junit.jupiter.api.Assertions.*;

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

        assertEquals(new Helper().getDetailsOfBooks(), library.getList(BOOK));
    }

    @DisplayName("Test to get the print list of movies from library")
    @Test
    void testForPrintingListOfMovies() {

        assertEquals(new Helper().getDetailsOfMovies(), library.getList(MOVIE));
    }

    @DisplayName("Test to remove a book expects true if removed")
    @Test
    void testForRemovingBook() {

        assertEquals("Thank you! Enjoy the item.\n", library.removeItemFromList("SECOND TITLE", BOOK));
        assertEquals("That item is not available.\n", library.removeItemFromList("SECOND TITLE", BOOK));
    }

    @DisplayName("Test to add a book expects true if added")
    @Test
    void testForAddingBook() {

        library.removeItemFromList("SECOND TITLE", BOOK);

        assertEquals("Thank you for returning the item.\n", library.addItemToList("SECOND TITLE", BOOK));
        assertEquals("That is not a valid item to return.\n", library.addItemToList("SIXTH TITLE", BOOK));
    }

    @DisplayName("Test to remove a movie expects true if removed")
    @Test
    void testForRemovingMovie() {

        assertEquals("Thank you! Enjoy the item.\n", library.removeItemFromList("AVENGERS", MOVIE));
        assertEquals("That item is not available.\n", library.removeItemFromList("AVENGERS", MOVIE));
    }

    @DisplayName("Test to add a movie expects true if added")
    @Test
    void testForAddingMovie() {

        library.removeItemFromList("AVENGERS", MOVIE);

        assertEquals("Thank you for returning the item.\n", library.addItemToList("AVENGERS", MOVIE));
        assertEquals("That is not a valid item to return.\n", library.addItemToList("AVENGERS", MOVIE));
    }

    @DisplayName("test to authenticate user expects true")
    @Test
    void authenticateUser() {
        UserId userId = new UserId(1234567);
        UserId userId1 = new UserId(1234568);
        UserPassword userPassword = new UserPassword("Nehar");

        assertTrue(library.isUserValid(userId, userPassword));
        assertFalse(library.isUserValid(userId1, userPassword));
    }

    @DisplayName("test to get details of current user as there is no current user should return null")
    @Test
    void getDetails() {
        assertEquals(USER_IS_NOT_LOGGED_IN, library.getInformationAboutCurrentUser());
    }
}
