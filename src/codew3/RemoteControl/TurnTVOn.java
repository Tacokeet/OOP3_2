package codew3.RemoteControl;

// a concrete command
public class TurnTVOn implements Command {

    ElectronicDevice myDevice;
    
    public TurnTVOn(ElectronicDevice device){
        // register receiver
        myDevice = device;
    }
    
    public void execute() {

        myDevice.on();
    }

    @Override
    public void undo() {
        System.out.println("You undid the TurnTVOn command!");

    }
}