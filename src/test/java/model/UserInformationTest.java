package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static main.Constants.STRING_FORMATTER_DETAILS;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserInformationTest {
    @DisplayName("get the information of user")
    @Test
    void testToGetDetails() {
        UserInformation userInformationTest = new UserInformation("neha", new Email("neha.arora@thoughtworks.com"), new PhoneNumber(123456789));

        assertEquals(String.format(STRING_FORMATTER_DETAILS, "neha", "neha.arora@thoughtworks.com", 123456789), userInformationTest.getDetails());
    }

    @DisplayName("get to compare user information")
    @Test
    void testToCompareDetails() {
        UserInformation userInformationTest = new UserInformation("neha", new Email("neha.arora@thoughtworks.com"), new PhoneNumber(123456789));
        UserInformation userInformationTest1 = new UserInformation("neha", new Email("neha.arora@thoughtworks.com"), new PhoneNumber(123456789));

        assertEquals(userInformationTest1, userInformationTest);
    }


}