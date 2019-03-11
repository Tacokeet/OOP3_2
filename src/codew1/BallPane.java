package codew1;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {
  public final double radius = 20;
  private double x = radius, y = radius;
  private double dx = 1, dy = 1;
  private Circle circle = new Circle(x, y, radius);
  private Timeline animation;
  private int Delay = 50;

  Thread thread = new Thread(() -> {
    try {
      while (true) {
        Platform.runLater(() -> moveBall());
        Thread.sleep(Delay);
      }
    }
    catch (InterruptedException ex) {
    }
  });

  public BallPane() {
    circle.setFill(Color.PURPLE); // Set ball color
    getChildren().add(circle); // Place a ball into this pane
    thread.start();

  }

  public void play() {
    thread.resume();
  }

  public void pause() {
    thread.suspend();
  }

  public void increaseSpeed() {
    if (Delay > 1)
      Delay--;
  }

  public void decreaseSpeed() {
    Delay++;
  }

  public DoubleProperty rateProperty() {
    return animation.rateProperty();
  }

  protected void moveBall() {
    // Check boundaries
    if (x < radius || x > getWidth() - radius) {
      dx *= -1; // Change ball move direction
    }
    if (y < radius || y > getHeight() - radius) {
      dy *= -1; // Change ball move direction
    }

    // Adjust ball position
    x += dx;
    y += dy;
    circle.setCenterX(x);
    circle.setCenterY(y);
  }
}