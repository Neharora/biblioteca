import helper.Helper;
import main.DefaultData;
import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DefaultDataTest {
    private DefaultData bookRepositary;

    @BeforeEach
    void init() {
        bookRepositary = new DefaultData();
    }

    @DisplayName("test to get default list of books")
    @Test
    void testForBookList() {

        assertEquals(new Helper().returnSetOfItems(), bookRepositary.getDefaultList());
    }
    @DisplayName("test to  get Default users")
    @Test
    void testToGetDefaultUsers(){
        Set<User> userSet = new Helper().getDefaultUsers();
        Set<User> userSetFromRepository = bookRepositary.getDefaultUsers();

        assertTrue(userSet.containsAll(userSetFromRepository));
    }
}