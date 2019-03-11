package codew1;

import java.math.BigDecimal;
import java.util.*;

public class TestSorting {

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort");

        // sort the list on age

        listDevs.sort(Comparator.comparingInt(Developer::getAge)); // What IDE recommends


        listDevs.sort((Developer d1, Developer d2) -> d1.getAge()-(d2.getAge())); // lambda

        listDevs.forEach((developer)->System.out.println(developer));



        // print the List

    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("Alwin", 33));
        result.add(new Developer("Peter", 24));
        result.add(new Developer("Johan", 26));
        result.add(new Developer("Tanja", 25));

        return result;
    }
}
