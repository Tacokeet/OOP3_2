package Patterns.ProeftoetsOpdracht2;

// abstract product
interface Car {

    public int getCost();
    public String getExtras();
}

// concrete products
class Sedan implements Car{

    int cost  = 30_000;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getExtras() {
        return null;
    }
}

class StationWagon implements Car{

    int cost = 40_000;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getExtras() {
        return null;
    }
}

class PickUp implements Car{

    int cost = 50_000;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getExtras() {
        return null;
    }
}

class SUV implements Car{

    int cost = 60_000;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getExtras() {
        return null;
    }
}