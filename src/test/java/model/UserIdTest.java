package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class UserIdTest {
    @DisplayName("test to compare two userId")
    @Test
    void testToCompare() {
        UserId userId1 = new UserId(1234567);
        UserId userId2 = new UserId(1234567);
        UserId userId3 = new UserId(1234568);

        assertEquals(userId1, userId2);
        assertNotEquals(userId2, userId3);
    }

}