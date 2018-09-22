import helper.Helper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultRepositaryTest {
    @DisplayName("test to get default list of books")
    @Test
    void testForBookList() {
        DefaultRepositary bookRepositary = new DefaultRepositary();

        assertEquals(new Helper().returnSetOfItems(), bookRepositary.getDefaultList());
    }

}