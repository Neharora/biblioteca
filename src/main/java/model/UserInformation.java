package model;

import java.util.Objects;

import static main.Constants.STRING_FORMATTER_DETAILS;

public class UserInformation {
    private String name;
    private Email email;
    private PhoneNumber phoneNumber;

    public UserInformation(String name, Email email, PhoneNumber phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    String getDetails() {
        return String.format(STRING_FORMATTER_DETAILS, name, email.emailAddress(), phoneNumber.getNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInformation that = (UserInformation) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phoneNumber);
    }
}
