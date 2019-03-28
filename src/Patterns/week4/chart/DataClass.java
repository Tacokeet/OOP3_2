package Patterns.week4.chart;

import javafx.application.Platform;
import javafx.scene.chart.XYChart;

class DataClass implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            Platform.runLater( () -> {
                ChartDemo.data1.getData().add(new XYChart.Data(2000, 120));
                ChartDemo.data2.getData().add(new XYChart.Data(2000, 2));
            } );

            Thread.sleep(500);
            Platform.runLater( () -> {
                ChartDemo.data1.getData().add(new XYChart.Data(2001, 102));
                ChartDemo.data2.getData().add(new XYChart.Data(2001,2));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                ChartDemo.data1.getData().add(new XYChart.Data(2002,98));
                ChartDemo.data2.getData().add(new XYChart.Data(2002,1));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                ChartDemo.data1.getData().add(new XYChart.Data(2003,85));
                ChartDemo.data2.getData().add(new XYChart.Data(2003,2));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                ChartDemo.data1.getData().add(new XYChart.Data(2004,95));
                ChartDemo.data2.getData().add(new XYChart.Data(2004, 3));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                ChartDemo.data1.getData().add(new XYChart.Data(2005,96));
                ChartDemo.data2.getData().add(new XYChart.Data(2005,1));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                ChartDemo.data1.getData().add(new XYChart.Data(2006,98));
                ChartDemo.data2.getData().add(new XYChart.Data(2006, 1));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                ChartDemo.data1.getData().add(new XYChart.Data(2007,123));
                ChartDemo.data2.getData().add(new XYChart.Data(2007, 2));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                ChartDemo.data1.getData().add(new XYChart.Data(2008,95));
                ChartDemo.data2.getData().add(new XYChart.Data(2008, 4));

            });
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
