package ships;

public class CombatShip extends Ship {
    int firePower;

    CombatShip(int sId, int power, ShipStatus shipStatus) {
        id = sId;
        firePower = power;
        status = shipStatus;
    }
}
