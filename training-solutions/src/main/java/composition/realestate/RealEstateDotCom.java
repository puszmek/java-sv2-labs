package composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {

        Address address = new Address("Debrecen", "4030", "Békés utca", 15);

        Details details = new Details("erkélyes lakás",100, 1);

        RealEstate realEstate = new RealEstate("négyszobás 100m2-es lakás", 82_000_000, details);
        System.out.println(realEstate);
        System.out.println(details);
        System.out.println(address);

        realEstate.setPrice(79_000_000);
        System.out.println("new price: " + realEstate.getPrice());
    }
}
