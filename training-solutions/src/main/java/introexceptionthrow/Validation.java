package introexceptionthrow;

public class Validation {

    public void validateName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Nem adott meg nevet!");
        }
    }

    public void validateAge(String ageString) {
        if (ageString == null || ageString.length() == 0) {
            throw new IllegalArgumentException("Nem adott meg életkort!");
        }
        char[] chars = ageString.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Nem számot, vagy nem pozitív számot adott meg!");
            }
        }
        int age = Integer.parseInt(ageString);
        if (age > 120) {
            throw new IllegalArgumentException("Érvénytelen életkor!");
        }
    }
}
