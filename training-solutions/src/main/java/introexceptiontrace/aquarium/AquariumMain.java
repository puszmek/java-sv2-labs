package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        Fish firstFish = new Fish("Vörös neonhal", "vörös-kék");
        Fish secondFish = new Fish("Vitorláshal", "ezüst-fekete csíkos");
        Fish thirdFish = new Fish("Szivárványos guppi", "piros-kék-sárga-fekete");
        aquarium.addFish(firstFish);
        aquarium.addFish(secondFish);
        aquarium.addFish(thirdFish);
        System.out.println(aquarium.getNumberOfFish());
    }
}

// NullPointerException kivétel keletkezik a 11. sorban, mert az Aquarium osztályban található lista nincs példányosítva (értéke null).
// A 11. sorban meghívjuk az Aquarium osztály addFish() metódusát, az továbbhív a lista add() metódusára, s kivétel keletkezik.