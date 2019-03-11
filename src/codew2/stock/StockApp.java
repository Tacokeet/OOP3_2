package codew2.stock;

import javafx.application.Application;
import javafx.stage.Stage;

// the Client
public class StockApp {
    public static void main(String[] args) {

        // create concrete subject
        TextView textView = new TextView();
        
        StockGrabber stockGrabber = new StockGrabber();

        // create and register concrete observer
        StockObserver observerIBM = new StockObserver(stockGrabber);
//        StockObserver observerAAPL = new StockObserver(stockGrabber);
//        StockObserver observerGOOG = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        Thread t1 = new Thread(stockGrabber);
        t1.start();

//        Application.launch(TextView.class, args);

    }
}

