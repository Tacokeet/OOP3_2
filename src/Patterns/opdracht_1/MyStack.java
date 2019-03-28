package Patterns.opdracht_1;

import java.util.Iterator;
import java.util.ArrayList;

public class MyStack implements Iterable<String> {

    private ArrayList<String> list = new ArrayList<>();

    // your code
	public void push(String item) {
		list.add(item);
	}

	public String pop() {
		if (list.isEmpty()) {
			return null;
		}
		return list.remove(list.size()-1);

	}

	public boolean isEmpty() {
		return list.isEmpty(); // list.size()==0;
	}

	class StackIterator implements Iterator<String> {
		int current = list.size()-1; // laatste element

		@Override
		public boolean hasNext() {
			return current>=0;
		}

		@Override
		public String next() {
			if (!hasNext()) {
				throw new IllegalStateException("No next element.");
			}
			return list.get(current--);
		}
	}

	@Override
	public Iterator<String> iterator() {
		System.out.println("Geef mij een iterator");
		return new StackIterator();
	}
}
