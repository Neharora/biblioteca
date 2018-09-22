package model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static final String WELCOME_MESSAGE = "Welcome to library pathshala\n";
    private static final String SUCCESS_MESSAGE_FOR_CHECKOUT = "Thank you! Enjoy the item.\n";
    private static final String UNSUCCESS_MESSAGE_FOR_CHECKOUT = "That item is not available.\n";
    private static final String SUCCESS_MESSAGE_FOR_CHECKIN = "Thank you for returning the item.\n";
    private static final String UNSUCCESS_MESSAGE_FOR_CHECKIN = "That is not a valid item to return.\n";
    private List<LibraryItem> presentItems;
    private List<LibraryItem> checkedOutItems;


    public Library(List<LibraryItem> presentItems) {
        this.checkedOutItems = new ArrayList<>();
        this.presentItems = presentItems;
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
                checkedOutItems.add(aBookSet);
                return SUCCESS_MESSAGE_FOR_CHECKOUT;
            }
        }
        return UNSUCCESS_MESSAGE_FOR_CHECKOUT;
    }

    public String addItemToList(String itemToCheckIn, ItemType itemType) {
        for (LibraryItem book : checkedOutItems) {
            if (book.isNameSame(itemToCheckIn, itemType)) {
                checkedOutItems.remove(book);
                presentItems.add(book);
                return SUCCESS_MESSAGE_FOR_CHECKIN;
            }
        }
        return UNSUCCESS_MESSAGE_FOR_CHECKIN;
    }
}
