package model;

import java.util.Objects;

public class Email {
    private String emailAddress;

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    String emailAddress() {
        return emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(emailAddress, email.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
