package inheritancemethods.plane;

public class Plane {

    public static void main(String[] args) {

        Passenger passenger = new Passenger("Kiss Péter", 38000);
        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlaneTicket());

        PriorityPassenger priorityPassenger = new PriorityPassenger("Kovács Dénes", 38000, 25);
        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPercent());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());

        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Ferenc Tamás", 38000, 25);
        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPercent());
        System.out.println(firstClassPassenger.getExtraCharge());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
    }
}
