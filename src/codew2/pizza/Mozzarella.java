package codew2.pizza;

// a Concrete Decorator
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Mozzarella");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + ", mozzarella";
    }
    
    public double getCost() {
        double cost = .50 * getSize();
        System.out.println("Cost of mozzarella: " + cost);
        return tempPizza.getCost() + cost;
    }

    @Override
    public char getSize() {
        return tempPizza.getSize();
    }

    @Override
    public void setSize(char s) {
        System.out.println("Inside Mozzarrella Calling setSize");
        tempPizza.setSize(s);
    }

}
