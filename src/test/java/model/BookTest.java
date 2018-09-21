package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book1, book2;

    @BeforeEach
    void init() {
        book1 = new Book("FIRST TITLE", "neha", 2018);
        book2 = new Book("FIRST TITLE", "neha", 2018);
    }

    @DisplayName("test for printing the books details")
    @Test
    void testForPrint() {
        assertEquals("\n|    FIRST TITLE              |    neha      |    2018      |", book1.getString());
    }

    @DisplayName("test for checking whether titles are equal or not")
    @Test
    void testForTitleComparision() {
        assertTrue(book1.isSameTitle("FIRST TITLE"));
        assertFalse(book1.isSameTitle("SECOND TITLE"));
    }

    @DisplayName("test for equality of two books")
    @Test
    void testForEquals() {
        assertEquals(book1, book2);
    }

    @DisplayName("test for getting title name")
    @Test
    void testForTitle() {

        assertEquals("FIRST TITLE", book1.getTitleName());
    }
}