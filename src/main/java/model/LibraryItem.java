package model;

import java.util.Objects;

public class LibraryItem {
    String name;
    String person;
    int year;
    ItemType itemType;

    LibraryItem(String name, String person, int year, ItemType itemType) {
        this.name = name;
        this.person = person;
        this.year = year;
        this.itemType = itemType;
    }

    boolean isNameSame(String name, ItemType itemType) {
        return this.name.equals(name) && this.itemType == itemType;
    }

    String getDetails(ItemType itemType) {
        if (itemType == this.itemType) {
            return String.format("\n|    %-25s|    %-10s|    %-10s|", name, person, year);
        }
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryItem that = (LibraryItem) o;
        return year == that.year &&
                Objects.equals(name, that.name) &&
                Objects.equals(person, that.person) &&
                itemType == that.itemType;
    }
}
