package Patterns.opdracht_1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("kwik");
        stack.push("kwek");
        stack.push("kwak");

        // your code

		for(String duck : stack) {
			System.out.println(duck);
		}

		stack.iterator().forEachRemaining(System.out::println);

		Iterator<String> it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		for(int i=0; i<3; i++) {
			System.out.println(stack.pop());
		}
    }
}
