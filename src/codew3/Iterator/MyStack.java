package codew3.Iterator;

import java.util.Iterator;
import java.util.ArrayList;

public class MyStack<E> implements Iterable<E> {

    private ArrayList<E> list = new ArrayList<>();

    @Override
    public Iterator<E> iterator() {
        StackIterator iterator = new StackIterator();
        while(iterator.hasNext()){
            System.out.println(pop());
        }
        return null;

    }

    public void push(E s){
        list.add(s);
    }

    public E pop(){
        E s = list.get(list.size() - 1);
        list.remove(list.size() -1);
        return s;
    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public class StackIterator<E> implements Iterator<E> {
        int index;

        @Override
        public boolean hasNext() {
            if(index < list.size()){
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            if(this.hasNext()){
                return (E) list.get(index++);
            }
            return null;
        }
    }

}
