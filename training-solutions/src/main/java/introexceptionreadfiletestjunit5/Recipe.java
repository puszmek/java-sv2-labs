package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private List<String> ingredients = new ArrayList<>();

    public void addIngredients(Path path) {
        List<String> ingredient = readFile(path);
        for (int i = 2; i < ingredient.size(); i++) {
            ingredients.add(ingredient.get(i).split(" ")[2]);
        }
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Hiba a fájl megnyitásakor!", ioe);
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
