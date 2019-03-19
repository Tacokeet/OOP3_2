package codew4;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TxtReader {
    public static void main(String[] args) throws FileNotFoundException {

        FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        File file = new File(dialog.getDirectory() + dialog.getFile());
        System.out.println(file);

        Scanner sc = new Scanner(file);
        int total = 0;

        sc.useDelimiter("\\ ");

        while (sc.hasNextLine()){
            int i = Integer.parseInt(sc.next().trim());
            total += i;
            System.out.println(i);
        }

        System.out.println("Total: " + total);



    }
}

