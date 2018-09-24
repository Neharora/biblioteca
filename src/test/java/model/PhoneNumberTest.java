package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneNumberTest {
    @DisplayName("test to get phone number")
    @Test
    void testToGetPhoneNumber() {
        PhoneNumber phoneNumber = new PhoneNumber(123456789);
        assertEquals(123456789, phoneNumber.getNumber());
    }

    @DisplayName("test to comapre two phone number")
    @Test
    void testToComparePhoneNumber() {
        PhoneNumber phoneNumber = new PhoneNumber(123456789);
        PhoneNumber phoneNumber1 = new PhoneNumber(123456789);
        assertEquals(phoneNumber1, phoneNumber);
    }
}