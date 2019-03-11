package codew1;

import java.awt.*;
import java.util.List;
import java.awt.image.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;
import javax.imageio.ImageIO;


public class TicTacToe {



    public static void main(String[] arguments) throws IOException {

        BufferedImage round = ImageIO.read(new File("F:\\Gebruikers\\Tacokeet\\Documenten\\OOP3\\src\\codew1\\o.gif"));
        BufferedImage cross = ImageIO.read(new File("F:\\Gebruikers\\Tacokeet\\Documenten\\OOP3\\src\\codew1\\x.gif"));
        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TRANSLUCENT);

        List<BufferedImage> images = new ArrayList<>();
        images.add(round);
        images.add(cross);
        images.add(img);



        JPanel panel = new JPanel();



        Random rand = new Random();


        for (int i = 0; i < 9; i++) {
            int randomIndex = rand.nextInt(images.size());
            BufferedImage randomElement = images.get(randomIndex);
            JLabel label = new JLabel(new ImageIcon(randomElement));
            panel.add(label);

//            int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
//            switch (randomNum){
//                case 0:
//                    JLabel labelR = new JLabel(new ImageIcon(round));
//                    panel.add(labelR);
//                    break;
//                case 1:
//                    JLabel labelC = new JLabel(new ImageIcon(cross));
//                    panel.add(labelC);
//                    break;
//                case 2:
//                    JLabel label = new JLabel();
//                    panel.add(label);
//                    break;
//            }

        }


        panel.setLayout(new GridLayout(3,3));  //give your JPanel a GridLayout



        // main window
        JFrame frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // add the Jpanel to the main window
        frame.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
