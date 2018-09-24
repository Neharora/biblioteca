package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class UserPasswordTest {
    @DisplayName("test to compare passwords")
    @Test
    void testToComparePasswords() {
        UserPassword userPassword1 = new UserPassword("Nehar");
        UserPassword userPassword2 = new UserPassword("Nehar");
        UserPassword userPassword3 = new UserPassword("nehar");

        assertEquals(userPassword1, userPassword2);
        assertNotEquals(userPassword2, userPassword3);
    }

}