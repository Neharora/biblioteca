package model;

import main.DefaultData;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static main.Constants.*;

public class Library {

    private List<LibraryItem> presentItems;
    private List<CheckedOutDetails> checkedOutItems;
    private Set<User> userList;
    private User currentUser;


    public Library(List<LibraryItem> presentItems) {
        this.checkedOutItems = new ArrayList<>();
        this.presentItems = presentItems;
        this.userList = new DefaultData().getDefaultUsers();
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public List<String> getList(ItemType itemType) {
        List<String> details = new ArrayList<>();
        for (LibraryItem presentItem : presentItems) {
            String data = presentItem.getDetails(itemType);
            if (!data.equals("")) {
                details.add(data);
            }
        }
        return details;
    }

    public String removeItemFromList(String itemToCheckOut, ItemType itemType) {
        for (LibraryItem aBookSet : presentItems) {
            if (aBookSet.isNameSame(itemToCheckOut, itemType)) {
                presentItems.remove(aBookSet);
                checkedOutItems.add(new CheckedOutDetails(aBookSet, currentUser));
                return SUCCESS_MESSAGE_FOR_CHECKOUT;
            }
        }
        return UNSUCCESS_MESSAGE_FOR_CHECKOUT;
    }

    public String addItemToList(String itemToCheckIn, ItemType itemType) {
        for (CheckedOutDetails book : checkedOutItems) {
            if (book.libraryItem.isNameSame(itemToCheckIn, itemType)) {
                checkedOutItems.remove(book);
                presentItems.add(book.libraryItem);
                return SUCCESS_MESSAGE_FOR_CHECKIN;
            }
        }
        return UNSUCCESS_MESSAGE_FOR_CHECKIN;
    }

    public boolean isUserValid(UserId userId, UserPassword userPassword) {
        for (User user1 : userList) {
            if (user1.validate(userId, userPassword)) {
                currentUser = user1;
                return true;
            }
        }
        return false;
    }

    public String getInformationAboutCurrentUser() {
        if (currentUser != null) {
            return currentUser.getUserDetails();
        }
        return USER_IS_NOT_LOGGED_IN;
    }
}
