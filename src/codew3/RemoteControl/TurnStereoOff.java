package codew3.RemoteControl;

// a concrete command
public class TurnStereoOff implements Command {

    ElectronicDevice myDevice;

    public TurnStereoOff(ElectronicDevice device){

        myDevice = device;
    }

    public void execute() {

        myDevice.off();
    }

    @Override
    public void undo() {
        System.out.println("You undid the TurnStereoOff command!");
    }
}