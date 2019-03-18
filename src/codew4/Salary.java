package codew4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("C:\\Users\\Tacokeet\\IdeaProjects\\OOP3_2\\src\\codew4\\Salary.txt");

        Scanner sc = new Scanner(file1);

        sc.useDelimiter("\\ ");

        while (sc.hasNext()){
            String name = sc.next().trim();
            if (name.equals("associate")){
                System.out.println(sc.next().trim());
            }
        }


    }
}
