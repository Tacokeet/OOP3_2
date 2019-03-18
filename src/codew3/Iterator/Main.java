package codew3.Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("kwik");
        stack.push("kwek");
        stack.push("kwak");

        stack.iterator();

        stack.push("kwik");
        stack.push("kwek");
        stack.push("kwak");

        System.out.println("\n");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
