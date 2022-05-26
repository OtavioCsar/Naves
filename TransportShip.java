package ships;

public class TransportShip extends Ship {
    public int capacity;

    TransportShip(int sId, int cap, ShipStatus shipStatus) {
        id = sId;
        capacity = cap;
        status = shipStatus;
    }

}
