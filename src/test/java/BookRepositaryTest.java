import helper.Helper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositaryTest {
    @DisplayName("test to get default list of books")
    @Test
    void testForBookList() {
        BookRepositary bookRepositary = new BookRepositary();

        assertEquals(new Helper().returnBookSet(),bookRepositary.getDefaultBooks());
    }

}