package codew2.Factory;

public class FactoryDemo {

    public static void main(String[] args) {
        CarFactory CarFactory = new CarFactory();

        //get an object of SportsCar and call its method.
        Car car1 = CarFactory.getCar("SPORTSCAR");

        //call method of SportsCar
        car1.hello();

        //get an object of PoliceCar and call its draw method.
        Car car2 = CarFactory.getCar("POLICECAR");

        //call method of PoliceCar
        car2.hello();

        //get an object of FancyCar and call its draw method.
        Car car3 = CarFactory.getCar("FANCYCAR");

        //call method of FancyCar
        car3.hello();
    }
}
