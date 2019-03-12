package codew3.Iterator;

import java.util.Iterator;
import java.util.ArrayList;

public class MyStack implements Iterable<String> {

    private ArrayList<String> list = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        StackIterator iterator = new StackIterator();
        while(iterator.hasNext()){
            System.out.println(pop());
        }
        return null;
    }

    public void push(String s){
        list.add(s);
    }

    public String pop(){
        String s = list.get(list.size() - 1);
        list.remove(list.size() -1);
        return s;
    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public class StackIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < list.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return list.get(index++);
            }
            return null;
        }
    }

}
