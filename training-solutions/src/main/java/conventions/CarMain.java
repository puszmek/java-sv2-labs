package conventions;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("Ford", "EcoBoost hibrid", 3, 4);

        System.out.println("Type of car: " + car.getCarType());
        System.out.println("Type of engine: " + car.getEngineType());
        System.out.println("Number of doors: " + car.getDoors());
        System.out.println("Number of persons: " + car.getPersons());

        car.addModelName("Fiesta");
        System.out.println("Type and model of car: " + car.getCarType());
        System.out.println(car.getCarType() + " " + car.getEngineType() + " (doors: " + car.getDoors() + ", persons: " + car.getPersons() + ")");
        System.out.println("");

        car.setCarType("Mazda");
        car.setEngineType("Skyactiv-X");
        car.setDoors(5);
        car.setPersons(5);
        car.addModelName("CX-30");

        System.out.println("Type of car: " + car.getCarType());
        System.out.println("Type of engine: " + car.getEngineType());
        System.out.println("Number of doors: " + car.getDoors());
        System.out.println("Number of persons: " + car.getPersons());
        System.out.println(car.getCarType() + " " + car.getEngineType() + " (doors: " + car.getDoors() + ", persons: " + car.getPersons() + ")");

    }

}
