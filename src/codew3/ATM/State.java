package codew3.ATM;

public class State implements ATMBasis {

    private ATM atm;

    public State(ATM atm){
        this.atm = atm;
    }

    public void insertCard() {
        atm.getState().insertCard(atm);
    }

    public void ejectCard() {
        atm.getState().ejectCard(atm);
    }

    public void insertPin() {
        atm.getState().insertPin(atm);
    }

    public void requestAmount() {
        atm.getState().requestAmount(atm);
    }
}
