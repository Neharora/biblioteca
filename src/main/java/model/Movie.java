package model;


import static main.Constants.STRING_FORMATTER_MOVIE;

public class Movie extends LibraryItem {
    private int movieRating;

    public Movie(String movieName, String m, int year, ItemType itemType, int movieRating) {
        super(movieName, m, year, itemType);
        this.movieRating = movieRating;
    }

    @Override
    String getDetails(ItemType itemType) {
        if (itemType == this.itemType) {
            return String.format(STRING_FORMATTER_MOVIE, name, person, year, movieRating);
        }
        return "";
    }


}
