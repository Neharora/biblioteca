package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static main.Constants.STRING_FORMATTER_DETAILS;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user1, user2, user3;

    @BeforeEach
    void init() {
        UserInformation userInformation = new UserInformation("neha", new Email("neha.arora@thoughtworks.com"), new PhoneNumber(1233456789));
        user1 = new User(new UserId(1234567), new UserPassword("Nehar"), userInformation);
        user2 = new User(new UserId(1234567), new UserPassword("Nehar"), userInformation);
        user3 = new User(new UserId(1234567), new UserPassword("Neha"), userInformation);
    }

    @DisplayName("test two compare two users")
    @Test
    void testToCompare() {
        assertEquals(user1, user2);
        assertNotEquals(user2, user3);
    }

    @DisplayName("test to get details")
    @Test
    void getUserDetails() {
        assertEquals(String.format(STRING_FORMATTER_DETAILS, "neha", "neha.arora@thoughtworks.com", 1233456789), user1.getUserDetails());
    }

    @DisplayName("test to validate user")
    @Test
    void testToValidateUser() {
        assertTrue(user1.validate(new UserId(1234567), new UserPassword("Nehar")));
        assertFalse(user1.validate(new UserId(1234568), new UserPassword("Nehar")));
    }

}