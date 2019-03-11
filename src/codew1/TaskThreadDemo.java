package codew1;

import javafx.concurrent.Task;

import javax.swing.*;
import java.awt.*;

public class TaskThreadDemo {



    public static void main(String[] args) {

        TextArea textArea1 = new TextArea("Concurrent output / TextArea1");
        TextArea textArea2 = new TextArea("TextArea2");
        textArea2.getTextArea().append("This is TextArea2");

        // Create tasks
        Runnable printA = new PrintChar('a', 100,textArea2);
        Runnable printB = new PrintChar('b', 100,textArea1);
        Runnable print100 = new PrintNum(100,textArea2);

        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

  }
}

class TextArea {

    private static JTextArea textArea; //needed for other classes

    public TextArea(String name){
        // Create text area
        JPanel panel = new JPanel(); //create panel
        panel.setLayout(new BorderLayout());  //give your JPanel a BorderLayout

        textArea = new JTextArea(); //create textarea
        textArea.setLineWrap(true); //set Linewrap on true so that is will create newline based on width

        JScrollPane scroll = new JScrollPane(textArea); //place the JTextArea in a scroll pane
        panel.add(scroll, BorderLayout.CENTER); //add the JScrollPane to the panel

        JFrame frame=new JFrame(name); //create frame to put stuff in
        frame.add(panel); //add panel to the jframe
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //if frame is closed stop running
        frame.setSize(400,150); //setting size for the frame
        frame.setVisible(true); //set to visibility to true so that you can see the frame
    }

    public static JTextArea getTextArea() {
        return textArea;
    }
}

// The task for printing a specified character in specified times
class PrintChar implements Runnable {
  private char charToPrint; // The character to print
  private int times; // The times to repeat
  private TextArea ta;

  /** Construct a task with specified character and number of
   *  times to print the character
   */
  public PrintChar(char c, int t, TextArea ta) {
    charToPrint = c;
    times = t;
    this.ta = ta;

  }

  /** Override the run() method to tell the system
   *  what the task to perform
   */
  public void run() {
    for (int i = 0; i < times; i++) {
        ta.getTextArea().append(String.valueOf(charToPrint));
        System.out.print(charToPrint);
    }
  }
}

// The task class for printing number from 1 to n for a given n
class PrintNum implements Runnable {
  private int lastNum;
  private TextArea ta;

  /** Construct a task for printing 1, 2, ... i */
  public PrintNum(int n, TextArea ta) {
    lastNum = n;
    this.ta = ta;

  }

  /** Tell the thread how to run */
  public void run() {
    for (int i = 1; i <= lastNum; i++) {
        ta.getTextArea().append(" "+ i);
      System.out.print(" " + i);
    }
  }
}
