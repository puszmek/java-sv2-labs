package lambda.sapling;

import java.util.ArrayList;
import java.util.List;

public class TreeNursery {

    private List<Sapling> saplings = new ArrayList<>();

    public TreeNursery(List<Sapling> saplings) {
        this.saplings = saplings;
    }

    public List<Sapling> getSaplings() {
        return new ArrayList<>(saplings);
    }

    public void prune(int maxHeight) {
        saplings.forEach(sapling -> sapling.cut(maxHeight));
    }

    public void sell(String species, int minHeight) {
        saplings.removeIf((Sapling sapling) -> {
            return (sapling.getSpecies().equals(species) && sapling.getHeight() > minHeight);
        });
    }
}
