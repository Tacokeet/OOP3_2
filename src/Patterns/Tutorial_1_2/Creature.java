package Patterns.Tutorial_1_2;

abstract public class Creature {

    protected String name;
    protected int Weight;
    protected String sound;

    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setWeight(int newWeight);
    public abstract int getWeight();


}
