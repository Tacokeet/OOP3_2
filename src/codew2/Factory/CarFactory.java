package codew2.Factory;

public class CarFactory {

    //use getShape method to get object of type shape
    public Car getCar(String carType){
        if(carType == null){
            return null;
        }
        if(carType.equalsIgnoreCase("SPORTSCAR")){
            return new SportsCar();

        } else if(carType.equalsIgnoreCase("POLICECAR")){
            return new PoliceCar();

        } else if(carType.equalsIgnoreCase("FANCYCAR")){
            return new FancyCar();
        }

        return null;
    }
}
