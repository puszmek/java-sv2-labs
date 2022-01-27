package sorting.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDealer {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCarsOrderedByYearOfConstruction() {
        List<Car> result = new ArrayList<>(cars);
        Collections.sort(result, new CarConstructionComparator());
        return result;
    }

    public List<Car> getCarsOrderedByPrice() {
        List<Car> result = new ArrayList<>(cars);
        Collections.sort(result, new CarPriceComparator());
        return result;
    }
}
