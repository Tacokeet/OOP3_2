package codew2.stock;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class StockGrabber implements Subject, Runnable {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        // a list to hold all observers
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    public void unregister(Observer newObserver) {
        observers.remove(newObserver);
    }

    public void notifyObserver() {

        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice) {
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }

    public double getRandomStockPrice(double price){
        double randNum = (Math.random() * (.1)) - .05;
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.valueOf(df.format((price + randNum)));
    }

    @Override
    public void run() {
        while (true) {
            setAAPLPrice(getRandomStockPrice(this.aaplPrice));
            setGOOGPrice(getRandomStockPrice(this.googPrice));
            setIBMPrice(getRandomStockPrice(this.ibmPrice));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
