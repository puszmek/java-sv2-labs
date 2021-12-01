package immutable;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private final int yearOfProduction;

    public Car(String brand, String model, int yearOfProduction) {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("A márka nem lehet üres!");
        }
        if (yearOfProduction > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("A gyártási év nem lehet a jelenleginél későbbi év!");
        }
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
