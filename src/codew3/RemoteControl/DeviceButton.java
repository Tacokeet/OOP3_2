package codew3.RemoteControl;

// invoker
public class DeviceButton {
    
    public void execute(Command cmd){
        
        System.out.println("Device button is pressed !");
        cmd.execute();
    }
}