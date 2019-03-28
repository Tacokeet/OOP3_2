package Patterns.ProeftoetsOpdracht1;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyStack implements Iterable<String> {

    private ArrayList<String> list = new ArrayList<>();

    public void push(String o){
        list.add(o);
    }

    public String pop(){
        return list.remove(list.size()-1);
    }

    public boolean isEmpty(){
        return list.size()==0;
    }

    public int getSize(){
        return list.size();
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }

    // your code

}
