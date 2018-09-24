package model;


import java.util.Objects;
import java.util.Set;

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
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(password, user.password);
    }

    String getUserDetails() {
        return userInformation.getDetails();
    }

    private boolean validate(User user) {
        return this.userId.equals(user.userId) && this.password.equals(user.password);
    }

    public User validate(Set<User> userSet) {
        for (User user1 : userSet) {
            if (user1.validate(this)) {
                return user1;
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, password, userInformation);
    }
}
