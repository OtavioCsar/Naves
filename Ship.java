package ships;

public abstract class Ship {
    protected int id;
    protected ShipStatus status;

    boolean Landing() {
        if (status == ShipStatus.Traveling) {
            return true;
        } else {
            return false;
        }
    }

    boolean Leaving() {
        if (status == ShipStatus.Docked) {
            return true;
        } else {
            return false;
        }
    }
}
