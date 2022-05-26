package ships;

import java.util.Random;

public class Main()
{

    public static void main(String[] args) {
        Random rand = new Random();
        Ship ship1 = new TransportShip(1,"teste",rand.nextBoolean() ? ShipStatus.Docked : ShipStatus.Traveling);
        
    }
}