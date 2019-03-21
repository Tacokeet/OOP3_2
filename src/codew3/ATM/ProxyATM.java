package codew3.ATM;

public class ProxyATM implements ATMBasis{

    private ATM atm;
    private State state;

    public ProxyATM(ATM atm){
        this.state = new State(atm);
        // dependency injection
        this.atm = atm;
    }

    void setState(ATMState state) {
        atm.setState(state);
    }

    @Override
    public void insertCard() {
        state.insertCard();
    }

    @Override
    public void ejectCard() {
        state.ejectCard();
    }

    @Override
    public void insertPin() {
        state.insertPin();
    }

    @Override
    public void requestAmount() {
        state.requestAmount();
    }
}
