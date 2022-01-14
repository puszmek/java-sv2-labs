package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight) {
        int remainderPassengers = passengers;
        int remainderCargoWeight = cargoWeight;
        for (Ship actual : ships) {
            if (actual instanceof CanCarryPassengers) {
                if (remainderPassengers != 0) {
                    remainderPassengers = ((CanCarryPassengers) actual).loadPassenger(remainderPassengers);
                }
            }
            if (actual instanceof CanCarryGoods) {
                if (remainderCargoWeight != 0) {
                    remainderCargoWeight = ((CanCarryGoods) actual).loadCargo(remainderCargoWeight);
                }
            }
        }
        waitingPeople = remainderPassengers;
        waitingCargo = remainderCargoWeight;
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
