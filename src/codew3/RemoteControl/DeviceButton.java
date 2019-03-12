package codew3.RemoteControl;

import java.util.Stack;

// invoker
public class DeviceButton {

    private final Stack<Command> undoStack;

    public DeviceButton(){
        undoStack = new Stack<>();

    }

    public void execute(Command cmd){
        undoStack.push(cmd);
        System.out.println("Device button is pressed !");
        cmd.execute();
    }

    public void undo(){
        if (!undoStack.isEmpty()){
            System.out.println("Undo button is pressed !");
            Command cmd = undoStack.pop();
            cmd.undo();

        }
    }
}