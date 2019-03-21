package codew3.ATM;

// the context
public class ATM
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
}
