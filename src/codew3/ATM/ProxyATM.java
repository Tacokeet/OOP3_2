package codew3.ATM;

public class ProxyATM implements ATMBasis{

    private ATM atm;

    public ProxyATM(){
        this.atm = new ATM();
    }

    void setState(ATMState state) {
        atm.setState(state);
    }

    @Override
    public void insertCard() {
        atm.insertCard();
    }

    @Override
    public void ejectCard() {
        atm.ejectCard();
    }

    @Override
    public void insertPin() {
        atm.insertPin();
    }

    @Override
    public void requestAmount() {
        atm.requestAmount();
    }
}
