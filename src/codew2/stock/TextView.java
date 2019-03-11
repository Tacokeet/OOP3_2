package codew2.stock;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextView extends Application implements Observer{

    private Text textIBM;
    private Text textAAPL;
    private Text textGOOG;

    @Override
    public void start(Stage primaryStage) {

        FlowPane flowPane = new FlowPane();
        Text textIBM = new Text();
        textIBM.setText("IBM: N/A");
        Text textAAPL = new Text();
        textAAPL.setText("AAPL: N/A");
        Text textGOOG = new Text();
        textGOOG.setText("GOOG: N/A");

        flowPane.getChildren().addAll(textIBM,textAAPL,textGOOG);

        Scene scene = new Scene(flowPane,300,300);
        primaryStage.setTitle("Stock TextView");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        textIBM.setText(Double.toString(ibmPrice));
        textAAPL.setText(Double.toString(aaplPrice));
        textGOOG.setText(Double.toString(googPrice));


    }

    public static void main(String[] args) {
        launch(args);
    }


}
