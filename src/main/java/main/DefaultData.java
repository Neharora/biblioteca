package main;

import model.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DefaultData {
    private List<LibraryItem> defaultBooks;

    public DefaultData() {
        this.defaultBooks = new ArrayList<>();
    }

    public List<LibraryItem> getDefaultList() {
        Book book1 = new Book("FIRST TITLE", "neha", 2018, ItemType.BOOK);
        Book book2 = new Book("SECOND TITLE", "neha", 2018, ItemType.BOOK);
        Book book3 = new Book("THIRD TITLE", "neha", 2018, ItemType.BOOK);
        Book book4 = new Book("FOURTH TITLE", "neha", 2018, ItemType.BOOK);
        Book book5 = new Book("FIFTH TITLE", "neha", 2018, ItemType.BOOK);

        Movie movie = new Movie("AVENGERS", "neha", 2018, ItemType.MOVIE, 8);
        Movie movie1 = new Movie("SECOND TITLE", "neha", 2018, ItemType.MOVIE, 8);
        Movie movie2 = new Movie("THIRD TITLE", "neha", 2018, ItemType.MOVIE, 7);
        Movie movie3 = new Movie("FOURTH TITLE", "neha", 2018, ItemType.MOVIE, 6);
        Movie movie4 = new Movie("FIFTH TITLE", "neha", 2018, ItemType.MOVIE, 8);

        defaultBooks.add(book1);
        defaultBooks.add(book2);
        defaultBooks.add(book3);
        defaultBooks.add(book4);
        defaultBooks.add(book5);
        defaultBooks.add(movie);
        defaultBooks.add(movie1);
        defaultBooks.add(movie2);
        defaultBooks.add(movie3);
        defaultBooks.add(movie4);
        return defaultBooks;
    }

    public Set<User> getDefaultUsers() {
        Set<User> userList = new HashSet<>();
        UserInformation userInformation = new UserInformation("neha",
                new Email("neha.arora@thoughtworks.com"),
                new PhoneNumber(1233456789));

        User user1 = new User(new UserId(1234567), new UserPassword("Nehar"), userInformation);
        User user2 = new User(new UserId(1234568), new UserPassword("Nehaq"), userInformation);
        User user3 = new User(new UserId(1234569), new UserPassword("Nehaa"), userInformation);
        User user4 = new User(new UserId(1234566), new UserPassword("Nehad"), userInformation);
        User user5 = new User(new UserId(1234565), new UserPassword("Nehaf"), userInformation);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        return userList;
    }
}
