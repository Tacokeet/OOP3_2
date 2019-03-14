package codew3.ATM;

// the context
public class ATM implements ATMBasis
{
    private ATMState state;
    private int amount = 100;

    // define an initial state
    public ATM() {
        setState(new IdleState());
    }

    void setState(ATMState state) {
        this.state = state;
    }

    ATMState getState() {
        return this.state;
    }

    public void insertCard() {
        state.insertCard(this);
    }

    public void ejectCard() {
        state.ejectCard(this);
    }

    public void insertPin() {
        state.insertPin(this);
    }

    public void requestAmount() {
        state.requestAmount(this);
    }
}
