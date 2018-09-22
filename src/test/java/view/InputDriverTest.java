package view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class InputDriverTest {
    private InputDriver inputDriver;

    @BeforeEach
    void init() {
        inputDriver = new InputDriver();
    }

    @DisplayName("test for checking user's choice")
    @Test
    void testMenuInput() {
        setSystemIn("3\n");

        assertEquals(3, inputDriver.askChoice());
    }

    @DisplayName("test for reset the system in")
    @Test
    void testMenuResetSystemIn() {
        setSystemIn("3\n");

        assertNotEquals(2, inputDriver.askChoice());
    }

    @DisplayName("test for getting the book to be checkout")
    @Test
    void getBookNameToCheckout() {
        setSystemIn("FIRST TITLE");

        assertEquals("FIRST TITLE", inputDriver.askForItemName());
    }

    private void setSystemIn(String string) {
        System.setIn(new ByteArrayInputStream(string.getBytes()));
    }

    @AfterEach
    void teardown() {
        System.setIn(System.in);
    }
}