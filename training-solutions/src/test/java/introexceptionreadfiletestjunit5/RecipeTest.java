package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    Recipe recipe = new Recipe();

    @Test
    void testCreate() {
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void testAddIngredients() {
        recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"), recipe.getIngredients());
        assertEquals(10, recipe.getIngredients().size());
        assertEquals("citrom", recipe.getIngredients().get(4));
    }

    @Test
    void testAddIngredientsFileNotFound() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(Paths.get("src/test/resources/recipenotfound.txt")));
        assertEquals("Hiba a fájl megnyitásakor!", ise.getMessage());
    }
}
