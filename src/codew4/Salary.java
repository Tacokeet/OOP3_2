package codew4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("C:\\Users\\Tacokeet\\IdeaProjects\\OOP3_2\\src\\codew4\\Salary.txt");

        Scanner sc = new Scanner(file1);

        sc.useDelimiter("\\ ");
        double assistantSal = 0;
        int assistantCounter = 0;
        double associateSal = 0;
        int associateCounter = 0;
        double fullSal = 0;
        int fullCounter = 0;

        // These if statements should be a switch statement
        while (sc.hasNext()){
            String name = sc.next().trim();
            if (name.equals("assistant")){
                assistantCounter++;
                sc.useDelimiter("\n");
                assistantSal += Double.parseDouble(sc.next().trim());
                sc.useDelimiter("\\ ");
            }
            if (name.equals("associate")){
                associateCounter++;
                sc.useDelimiter("\n");
                associateSal += Double.parseDouble(sc.next().trim());
                sc.useDelimiter("\\ ");
            }
            if (name.equals("full")){
                fullCounter++;
                sc.useDelimiter("\n");
                fullSal += Double.parseDouble(sc.next().trim());
                sc.useDelimiter("\\ ");
            }
        }
        System.out.println("Total salary assistant: " + assistantSal);
        System.out.println("Average assistant salary " + assistantSal/assistantCounter + "\n");
        System.out.println("Total salary associate: " + associateSal);
        System.out.println("Average associate salary " + associateSal/associateCounter + "\n");
        System.out.println("Total salary full: " + fullSal);
        System.out.println("Average full salary " + fullSal/fullCounter);

    }
}
