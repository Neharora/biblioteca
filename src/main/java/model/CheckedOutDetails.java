package model;

class CheckedOutDetails {
    LibraryItem libraryItem;
    private User user;

    CheckedOutDetails(LibraryItem libraryItem, User user) {
        this.libraryItem = libraryItem;
        this.user = user;
    }
}
