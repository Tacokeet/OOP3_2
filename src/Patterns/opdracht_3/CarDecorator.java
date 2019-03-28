package Patterns.opdracht_3;

public abstract class CarDecorator implements Car {
    
    protected final Car decoratedCar;

    // your code : constructor, getCost and getExtras

	public CarDecorator(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	@Override
	public int getCost() {
		return decoratedCar.getCost();
	}

	@Override
	public String getExtras() {
		return decoratedCar.getExtras();
	}
}

// your code : concrete decorators
class Navigatie extends CarDecorator {

	public Navigatie(Car decoratedCar) {
		super(decoratedCar);
	}

	@Override
	public int getCost() {
		return super.getCost()+400;
	}

	@Override
	public String getExtras() {
		return super.getExtras()+"navigatie";
	}
}

class CruiseControl extends CarDecorator {

	public CruiseControl(Car decoratedCar) {
		super(decoratedCar);
	}

	@Override
	public int getCost() {
		return super.getCost()+500;
	}

	@Override
	public String getExtras() {
		return super.getExtras()+"cruise control";
	}
}

class ParkAssistant extends CarDecorator {

	public ParkAssistant(Car decoratedCar) {
		super(decoratedCar);
	}

	@Override
	public int getCost() {
		return super.getCost()+600;
	}

	@Override
	public String getExtras() {
		return super.getExtras()+"park assistant";
	}
}
