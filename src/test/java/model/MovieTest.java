package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static model.ItemType.MOVIE;
import static org.junit.jupiter.api.Assertions.*;


class MovieTest {
    private Movie movie;

    @BeforeEach
    void init() {
        movie = new Movie("Avengers", "Jos Wehdon", 2012, MOVIE, 8);
    }

    @DisplayName("Test to get the details of movie")
    @Test
    void testForMovieDetails() {
        assertEquals(String.format("\n|    %-25s|    %-10s |    %-10s |    %s |", "Avengers", "Jos Wehdon", 2012, 8), movie.getDetails(MOVIE));
    }

    @DisplayName("Test to know movies are same or not")
    @Test
    void testForIsMovieSame() {
        assertTrue(movie.isNameSame("Avengers", MOVIE));
        assertFalse(movie.isNameSame("infinity war", MOVIE));
    }
}