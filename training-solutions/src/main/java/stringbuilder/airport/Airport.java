package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder stringBuilder = new StringBuilder("Törölt járatok: ");
        for (Flight flight: flights) {
            if (flight.getStatus() == Status.DELETED) {
                stringBuilder.append("\n" + flight.getFlightNumber());
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Airport airport = new Airport();

        Flight flightToBerlin = new Flight("QW-1234", Status.ACTIVE);
        Flight flightToLondon = new Flight("B-2351", Status.DELETED);
        Flight flightToBudapest = new Flight("N-312561", Status.DELETED);
        Flight flightToParis = new Flight("S-35", Status.DELETED);

        airport.addFlight(flightToBerlin);
        airport.addFlight(flightToLondon);
        airport.addFlight(flightToBudapest);
        airport.addFlight(flightToParis);

        System.out.println(airport.getDeletedFlights());
    }
}
