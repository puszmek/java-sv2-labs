package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Hamu", 2, "szürke");
        Dog dog2 = new Dog("Kifli", 1, "barna");
        Dog dog3 = new Dog("Bohóc", 2, "fehér");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog4.setColour("világosbarna");
        System.out.println(dogs);

        Dog dog5 = new Dog ("Gombóc", 1, "fekete");
        System.out.println(dog5);

        dog5 = dogs.get(1);
        System.out.println(dog5);

        dogs.add(dog5);
        System.out.println(dogs);

        Dog dog6 = dog4;
        dog6.setColour("sötétbarna");
        System.out.println(dogs);

        List<Dog> dogs1 = dogs;
        Dog dog7 = dog4;
        dog7.setColour("barnás");
        System.out.println(dogs1);

        dog2.setColour("aranybarna");
        System.out.println(dogs1);

        dog2 = null;
        System.out.println(dogs1);

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(dogs1);

        Dog dog9 = dogs.get(1);
        dog9.setColour("barna");
        System.out.println(dogs1);
    }
}
