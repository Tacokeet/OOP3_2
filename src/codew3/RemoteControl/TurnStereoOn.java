package codew3.RemoteControl;

public class TurnStereoOn implements Command {

    ElectronicDevice myDevice;

    public TurnStereoOn(ElectronicDevice device){

        myDevice = device;
    }

    public void execute() {

        myDevice.on();
    }
}
