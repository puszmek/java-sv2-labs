package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("gyümölcs");
        fruit.setWeight(12.5);

        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("szőlő");
        grape.setWeight(2.2);
        grape.setType("saszla");

        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        System.out.println(grape.getType());

        Apple apple = new Apple();
        apple.setName("alma");
        apple.setWeight(3.5);
        apple.setPieces(15);

        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());

        GoldenDelicious golden = new GoldenDelicious();
        golden.setName("golden alma");
        golden.setWeight(1.8);
        golden.setPieces(7);

        System.out.println(golden.getName());
        System.out.println(golden.getWeight());
        System.out.println(golden.getPieces());
        System.out.println(golden.getColour());

        Starking starking = new Starking();
        starking.setName("starking alma");
        starking.setWeight(1.8);
        starking.setPieces(9);

        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
        System.out.println(starking.getColour());
    }
}
