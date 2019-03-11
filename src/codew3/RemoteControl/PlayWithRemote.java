package codew3.RemoteControl;

// the client
public class PlayWithRemote{
    
    public static void main(String[] args){
        
        // create command receiver
        ElectronicDevice newTelevision = RemoteControl.getTelevision();
        
        // create a concrete command, register the receiver
        TurnTVOn onCommand = new TurnTVOn(newTelevision);

        // create invoker
        DeviceButton b = new DeviceButton();
        
        // invoke command
        b.execute(onCommand);
        
        // create another concrete command        
        TurnTVOff offCommand = new TurnTVOff(newTelevision);
        
        // invoke another concrete command
        b.execute(offCommand);



        // Stereo

        // create command receiver
        ElectronicDevice newStereo = RemoteControl.getStereo();

        // create a concrete command, register the receiver
        TurnStereoOn sOnCommand = new TurnStereoOn(newStereo);

        // invoke command
        b.execute(sOnCommand);

        // create another concrete command
        TurnStereoOff sOffCommand = new TurnStereoOff(newStereo);

        // invoke command
        b.execute(sOffCommand);
    }
}