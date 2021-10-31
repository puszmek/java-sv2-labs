package composition.person;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person("Kiss Péter", "789654AB");
        System.out.println(person.personToString());

        Address address = new Address("Magyarország", "Debrecen", "Békés utca 15.", "4030");
        person.moveTo(address);
        System.out.println(person.getAddress().addressToString());

        person.correctData("Kiss Máté Péter", "654789BA");
        System.out.println(person.personToString());

        address.correctData("Magyarország", "Kecskemét", "Kerekes utca 20.", "6000");
        System.out.println(person.getAddress().addressToString());
        System.out.println(person.getAddress().getCity());
    }
}
