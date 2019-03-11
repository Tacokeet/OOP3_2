package codew2.pizza;

// a Concrete Component
public class PlainPizza implements Pizza {
    private char size;

    public String getDescription() {
        return "Just a plain pizza of size";
    }

    public double getCost() {
        double cost = 4.00 * size;
        System.out.println("Cost of plain pizza: " + cost);
        return cost;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char s){
        size = s;
    }

}
