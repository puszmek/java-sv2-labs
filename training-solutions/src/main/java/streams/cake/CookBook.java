package streams.cake;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CookBook {

    private List<Cake> cakes = new ArrayList<>();

    public CookBook(List<Cake> cakes) {
        this.cakes = cakes;
    }

    public List<Cake> getCakes() {
        return cakes;
    }

    public List<String> listCakeNamesWithGivenIngredient(String ingredient) {
        List<String> result = cakes.stream()
                .filter(cake -> cake.getIngredient().contains(ingredient))
                .map(cake -> cake.getName())
                .collect(Collectors.toList());
        return result;
    }

    public List<String> listCakeNamesWithMaxIngredients(int max) {
        List<String> result = cakes.stream()
                .filter(cake -> cake.getIngredient().size() <= max)
                .map(cake -> cake.getName())
                .collect(Collectors.toList());
        return result;
    }
}
