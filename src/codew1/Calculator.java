package codew1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Calculator extends Application {
    @Override
    public void start(Stage primaryStage) {

        FlowPane flowPane = new FlowPane();

        Label label1 = new Label("Number 1:");
        TextField textField = new TextField ();
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField);
        hb.setSpacing(3);

        Label label2 = new Label("Number 2:");
        TextField textField2 = new TextField ();
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(label2, textField2);
        hb2.setSpacing(3);

        Label label3 = new Label("Result:");
        TextField textField3 = new TextField ();
        HBox hb3 = new HBox();
        hb2.getChildren().addAll(label3, textField3);
        hb2.setSpacing(3);


        Button add = new Button("Add");
        Button subtract = new Button("Subtract");
        Button multiply = new Button("Multiply");
        Button divide = new Button("Divide");


        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField3.setText(String.valueOf(Integer.parseInt(textField.getText()) + Integer.parseInt(textField2.getText())));
            }
        });

        subtract.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField3.setText(String.valueOf(Integer.parseInt(textField.getText()) - Integer.parseInt(textField2.getText())));
            }
        });

        multiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField3.setText(String.valueOf(Integer.parseInt(textField.getText()) * Integer.parseInt(textField2.getText())));
            }
        });

        divide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField3.setText(String.valueOf(Integer.parseInt(textField.getText()) / Integer.parseInt(textField2.getText())));
            }
        });

        flowPane.getChildren().addAll(hb,hb2,add,subtract,multiply,divide);




        Scene scene = new Scene(flowPane,620,100);
        primaryStage.setTitle("Grid with lines");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
