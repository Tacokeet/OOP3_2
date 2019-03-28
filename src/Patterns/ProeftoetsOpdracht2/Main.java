package Patterns.ProeftoetsOpdracht2;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        CarFactory factory = null;




        for (int i=0; i<20; i++){
            Random rand = new Random();
            int r1 = rand.nextInt(4) + 1;

            switch (r1) {
                case 1: CarFactory factory1 = new SedanFactory();
                        Car car = factory1.makeCar();
                        break;
                case 2: CarFactory factory2 = new PickupFactory();
                        Car car1 = factory2.makeCar();
                        break;
                case 3: CarFactory factory3 = new StationWagonFactory();
                        Car car2 = factory3.makeCar();
                        break;
                case 4: CarFactory factory4 = new SUVFactory();
                        Car car3 = factory4.makeCar();
                        break;
            }

            // your code

            //System.out.println("Type of car is " + car + " with price " + car.getCost());
        }
    }
}

