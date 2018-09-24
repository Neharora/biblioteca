package model;


import java.util.Objects;

public class User {
    private UserId userId;
    private UserPassword password;
    private UserInformation userInformation;

    public User(UserId userId, UserPassword password, UserInformation userInformation) {
        this.userId = userId;
        this.password = password;
        this.userInformation = userInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(password, user.password);
    }

    String getUserDetails() {
        return userInformation.getDetails();
    }

    boolean validate(UserId userId, UserPassword password) {
        return this.userId.equals(userId) && this.password.equals(password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, password, userInformation);
    }
}
