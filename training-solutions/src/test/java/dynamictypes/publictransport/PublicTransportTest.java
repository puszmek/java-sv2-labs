package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testPublicVehicles() {
        PublicVehicle bus = new Bus(15, 15.4, "Ikarus");
        PublicVehicle tram = new Tram(13, 28.6, 2);
        PublicVehicle metro = new Metro(3, 76.8, 8);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getPublicVehicles().size());
    }
}