package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();
        client.setName("Bob Doe");
        client.setYear(2000);
        client.setAddress("Warwick Road 70");
        System.out.println("Name: " + client.getName());
        System.out.println("Year of birth: " + client.getYear());
        System.out.println("Address: " + client.getAddress());

        Client newAddress = new Client();
        newAddress.migrate("Bond Street 7");
        System.out.println("You have successfully updated your address.");
        System.out.println("New address: " + newAddress.getAddress());


    }

}
