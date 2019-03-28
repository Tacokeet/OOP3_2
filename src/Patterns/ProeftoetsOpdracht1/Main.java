package Patterns.ProeftoetsOpdracht1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("kwik");
        stack.push("kwek");
        stack.push("kwak");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("\n");

        stack.push("kwik");
        stack.push("kwek");
        stack.push("kwak");

//        for (int i = stack.getSize();i>1;i++){
//            System.out.println(stack.pop());
//        }

        for (int i = 0;i<=2;i++){
            System.out.println(stack.pop());
        }

    }
}

