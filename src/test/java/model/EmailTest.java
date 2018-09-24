package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailTest {
    @DisplayName("test to get the details of email address")
    @Test
    void testToGetEmail() {
        Email email = new Email("neha.arora@thoughtworks.com");
        assertEquals("neha.arora@thoughtworks.com", email.emailAddress());
    }

    @DisplayName("test to compare emails")
    @Test
    void testForEquals() {
        Email email = new Email("neha.arora@thoughtworks.com");
        Email email1 = new Email("neha.arora@thoughtworks.com");
        assertEquals(email, email1);
    }

}