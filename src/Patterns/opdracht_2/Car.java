package Patterns.opdracht_2;
// abstract product
interface Car {

    public int getCost();
    public String getExtras();
}

// concrete products
class Sedan implements Car {
	@Override
	public int getCost() {
		return 30000;
	}

	@Override
	public String getExtras() {
		return "";
	}

	@Override
	public String toString() {
		return "Sedan";
	}

}

class StationWagon implements Car {

	@Override
	public int getCost() {
		return 40000;
	}

	@Override
	public String getExtras() {
		return "";
	}

	@Override
	public String toString() {
		return "StationWagon";
	}

}

class PickUp implements Car {

	@Override
	public int getCost() {
		return 50000;
	}

	@Override
	public String getExtras() {
		return "";
	}

	@Override
	public String toString() {
		return "PickUp";
	}

}

class SUV implements Car {

	@Override
	public int getCost() {
		return 60000;
	}

	@Override
	public String getExtras() {
		return "";
	}



}

