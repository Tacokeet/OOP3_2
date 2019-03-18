package codew2.pizza;

// a Concrete Decorator
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding sauce");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + ", tomato sauce";
    }
    
    public double getCost() {
        double cost = .35 * getSize();
        System.out.println("Cost of sauce: " + cost);
        return tempPizza.getCost() + cost;
    }

    @Override
    public char getSize() {
        return tempPizza.getSize();
    }

    @Override
    public void setSize(char s) {
        System.out.println("Inside TomatoSauce Calling setSize");
        tempPizza.setSize(s);
    }
}
