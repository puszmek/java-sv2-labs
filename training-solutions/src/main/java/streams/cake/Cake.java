package streams.cake;

import java.util.List;

public class Cake {

    private String name;
    private List<String> ingredient;

    public Cake(String name, List<String> ingredient) {
        this.name = name;
        this.ingredient = ingredient;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredient() {
        return ingredient;
    }
}
