package codew3.RemoteControl;

public class RemoteControl {

    // return a command receiver
    public static ElectronicDevice getTelevision(){
        
        return new Television();
    }

    // return a command receiver
    public static ElectronicDevice getStereo(){

        return new Stereo();
    }
}