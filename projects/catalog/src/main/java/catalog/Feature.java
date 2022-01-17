package catalog;

import java.util.List;

public interface Feature {      // jelzi, ha valaminek van címe és vannak közreműködők

    List<String> getContributors();      // visszaadja a katalógus elem közreműködőit (szerzők és előadók is)

    String getTitle();      // az elem címét adja vissza
}
