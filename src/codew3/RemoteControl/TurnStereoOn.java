package codew3.RemoteControl;

public class TurnStereoOn implements Command {

    ElectronicDevice myDevice;

    public TurnStereoOn(ElectronicDevice device){

        myDevice = device;
    }

    public void execute() {

        myDevice.on();
    }

    @Override
    public void undo() {
        System.out.println("You undid the TurnStereoOn command!");

    }
}
