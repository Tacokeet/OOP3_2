package Patterns.opdracht_3;

import java.util.Random;
import java.util.concurrent.Executors;

public class Main {

	public static void printInfo(Car car) {
		//With cruise control the price is 40500
		System.out.println("With "+car.getExtras()+" the price is "+car.getCost());
	}

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

			int r2 = rand.nextInt(3) + 1;

			switch (r2) {
				case 1:
					car=new Navigatie(car);
					break;
				case 2:
					car=new CruiseControl(car);
					break;
				case 3:
					car=new ParkAssistant(car);
					break;
				default:
					throw new IllegalStateException("Unsupported extra");
				// your code
			}
			printInfo(car);

        }
    }
}
