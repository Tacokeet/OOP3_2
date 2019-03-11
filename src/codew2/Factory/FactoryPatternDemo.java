package codew2.Factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        CarFactory shapeFactory = new CarFactory();

        //get an object of SportsCar and call its draw method.
        Car car1 = shapeFactory.getCar("SPORTSCAR");

        //call draw method of SportsCar
        car1.hello();

        //get an object of PoliceCar and call its draw method.
        Car car2 = shapeFactory.getCar("POLICECAR");

        //call draw method of PoliceCar
        car2.hello();

        //get an object of FancyCar and call its draw method.
        Car car3 = shapeFactory.getCar("FANCYCAR");

        //call draw method of FancyCar
        car3.hello();
    }
}
