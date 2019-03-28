package Patterns.opdracht_2;

import java.util.Random;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws Exception {
        CarFactory pickupFactory = new PickupFactory();
        CarFactory sedanFactory = new SedanFactory();
        CarFactory stationWagonFactory = new StationWagonFactory();
        CarFactory suvFactory = new SUVFactory();
        Car car;
        for (int i=0; i<20; i++){
            Random rand = new Random();
            int r1 = rand.nextInt(4) + 1;

            switch (r1) {
				case 1:
					car=pickupFactory.makeCar();
					break;
				case 2:
					car=sedanFactory.makeCar();
					break;
				case 3:
					car=stationWagonFactory.makeCar();
					break;
				case 4:
					car=suvFactory.makeCar();
					break;
				default:
					throw new IllegalStateException("Unsupported car");
            }
        
            // your code
            System.out.println("Type of car is " + car + " with price " + car.getCost());
        }
    }
}
