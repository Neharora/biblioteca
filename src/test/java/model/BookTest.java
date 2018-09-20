package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {
    private Book book;

    @BeforeEach
    void init() {
        book = new Book("First Title");
    }

    @DisplayName("test for printing the books details")
    @Test
    void testForPrint() {
        assertEquals("First Title", book.getString());
    }
}