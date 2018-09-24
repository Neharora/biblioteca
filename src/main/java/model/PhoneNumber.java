package model;

import java.util.Objects;

public class PhoneNumber {
    private int phoneNumber;

    public PhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    Object getNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return phoneNumber == that.phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }
}
