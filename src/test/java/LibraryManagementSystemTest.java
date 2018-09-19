import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryManagementSystemTest {
    @DisplayName("Test to get the welcomeMessage from biblioteca")
    @Test
    void testForWelcomeMessage() {
        String message = new LibraryManagementSystem().welcomeMessage();
        String expectedMessage = "LibraryManagementSystem to Biblioteca";
        assertEquals(expectedMessage, message);
    }
}
