package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static model.ItemType.BOOK;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book1;

    @BeforeEach
    void init() {
        book1 = new Book("FIRST TITLE", "neha", 2018, BOOK);
    }

    @DisplayName("test for printing the books details")
    @Test
    void testForPrint() {
        assertEquals(String.format("\n|    %-25s|    %-10s|    %-10s|", "FIRST TITLE", "neha", 2018), book1.getDetails(BOOK));
    }

    @DisplayName("test for checking whether titles are equal or not")
    @Test
    void testForTitleComparision() {
        assertTrue(book1.isNameSame("FIRST TITLE", BOOK));
        assertFalse(book1.isNameSame("SECOND TITLE", BOOK));
    }
}