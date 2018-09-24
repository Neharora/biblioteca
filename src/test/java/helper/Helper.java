package helper;

import model.*;
import org.junit.jupiter.api.Disabled;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static main.Constants.STRING_FORMATTER_BOOK;
import static main.Constants.STRING_FORMATTER_MOVIE;

@Disabled
public class Helper {
    public Library returnLibrary() {
        return new Library(returnSetOfItems());
    }

    public List<LibraryItem> returnSetOfItems() {
        List<LibraryItem> bookSet = new ArrayList<>();
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
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(movie);
        bookSet.add(movie1);
        bookSet.add(movie2);
        bookSet.add(movie3);
        bookSet.add(movie4);
        return bookSet;
    }

    public List<String> getDetailsOfBooks() {
        List<String> stringList = new ArrayList<>();
        String title1 = String.format(STRING_FORMATTER_BOOK,"FIRST TITLE","neha",2018);
        String title2 = String.format(STRING_FORMATTER_BOOK,"SECOND TITLE","neha",2018);
        String title3 = String.format(STRING_FORMATTER_BOOK,"THIRD TITLE","neha",2018);
        String title4 = String.format(STRING_FORMATTER_BOOK,"FOURTH TITLE","neha",2018);
        String title5 = String.format(STRING_FORMATTER_BOOK,"FIFTH TITLE","neha",2018);
        stringList.add(title1);
        stringList.add(title2);
        stringList.add(title3);
        stringList.add(title4);
        stringList.add(title5);
        return stringList;
    }

    public List<String> getDetailsOfMovies() {
        List<String> stringList = new ArrayList<>();
        String title1 = String.format(STRING_FORMATTER_MOVIE,"AVENGERS","neha",2018,8);
        String title2 = String.format(STRING_FORMATTER_MOVIE,"SECOND TITLE","neha",2018,8);
        String title3 = String.format(STRING_FORMATTER_MOVIE,"THIRD TITLE","neha",2018,7);
        String title4 = String.format(STRING_FORMATTER_MOVIE,"FOURTH TITLE","neha",2018,6);
        String title5 = String.format(STRING_FORMATTER_MOVIE,"FIFTH TITLE","neha",2018,8);
        stringList.add(title1);
        stringList.add(title2);
        stringList.add(title3);
        stringList.add(title4);
        stringList.add(title5);
        return stringList;
    }

    public Set<User> getDefaultUsers() {
        Set<User> users = new HashSet<>();
        UserInformation userInformation = new UserInformation("neha",
                new Email("neha.arora@thoughtworks.com"),
                new PhoneNumber(1233456789));

        User user1 = new User(new UserId(1234566), new UserPassword("Nehad"), userInformation);
        User user2 = new User(new UserId(1234568), new UserPassword("Nehaq"), userInformation);
        User user3 = new User(new UserId(1234569), new UserPassword("Nehaa"), userInformation);
        User user4 = new User(new UserId(1234567), new UserPassword("Nehar"), userInformation);
        User user5 = new User(new UserId(1234565), new UserPassword("Nehaf"), userInformation);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        return users;
    }
}
