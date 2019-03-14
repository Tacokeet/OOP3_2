package codew3.ATM;

public interface ATMState {

    void insertCard(ATM atm);

    void ejectCard(ATM atm);

    void insertPin(ATM atm);

    void requestAmount(ATM atm);

}

// implement the 5 concrete states

class IdleState implements ATMState {

    @Override
    public void insertCard(ATM atm) {
        atm.setState(new HasCard());
        System.out.println("Card Inserted!");
    }

    @Override
    public void ejectCard(ATM atm) {

    }

    @Override
    public void insertPin(ATM atm) {

    }

    @Override
    public void requestAmount(ATM atm) {

    }
}

class HasCard implements ATMState {

    @Override
    public void insertCard(ATM atm) {

    }

    @Override
    public void ejectCard(ATM atm) {
        atm.setState(new IdleState());
        System.out.println("Ejecting Card!");

    }

    @Override
    public void insertPin(ATM atm) {
        atm.setState(new HasCorrectPin());
        System.out.println("Correct Pin!");

    }

    @Override
    public void requestAmount(ATM atm) {

    }
}

class HasCorrectPin implements ATMState {

    @Override
    public void insertCard(ATM atm) {

    }

    @Override
    public void ejectCard(ATM atm) {
        atm.setState(new IdleState());
        System.out.println("Ejecting Card!");

    }

    @Override
    public void insertPin(ATM atm) {

    }

    @Override
    public void requestAmount(ATM atm) {
        atm.setState(new HasAmount());
        System.out.println("Received Amount!");
    }
}

class HasAmount implements ATMState {

    @Override
    public void insertCard(ATM atm) {

    }

    @Override
    public void ejectCard(ATM atm) {
        atm.setState(new IdleState());
        System.out.println("Ejecting Card!");
        System.out.println("Giving Money Honey!");

    }

    @Override
    public void insertPin(ATM atm) {

    }

    @Override
    public void requestAmount(ATM atm) {

    }
}

