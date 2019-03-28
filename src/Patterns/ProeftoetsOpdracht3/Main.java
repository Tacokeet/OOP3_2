package Patterns.ProeftoetsOpdracht3;

import java.util.Random;

public class Main {

   // public static void printInfo(Car car) {
        // your code
   // }

    public static void main(String[] args) throws Exception {
       // CarFactory factory = null;

        for (int i=0; i<20; i++){
            Random rand = new Random();
            int r1 = rand.nextInt(4) + 1;

            switch (r1) {
                // your code from assignment 1
            }

            // your code from assignment 1
           // System.out.println("Type of car is " + car + " with price " + car.getCost());

            int r2 = rand.nextInt(3) + 1;

            switch (r2) {
                // your code
            }
            //printInfo(car);
        }
    }
}

