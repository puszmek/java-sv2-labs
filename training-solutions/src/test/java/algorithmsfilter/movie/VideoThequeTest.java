package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    VideoTheque videoTheque;

    @BeforeEach
    void init() {
        videoTheque = new VideoTheque();
        videoTheque.addMovie(new Movie("Titanic", Category.ROMANTIC, 5));
        videoTheque.addMovie(new Movie("The Vow", Category.ROMANTIC, 4));
        videoTheque.addMovie(new Movie("The Lion King", Category.ANIMATION, 5));
    }

    @Test
    void testGetGoodMoviesWithCategoryGiven() {
        List<Movie> result = videoTheque.getGoodMoviesWithCategoryGiven(Category.ROMANTIC);
        assertEquals(2, result.size());
        assertEquals("Titanic", result.get(0).getTitle());
        assertEquals(4, result.get(1).getRating());
    }
}