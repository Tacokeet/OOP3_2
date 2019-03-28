package Patterns.ProeftoetsOpdracht1;

import java.util.function.Consumer;

public class StackIterator implements java.util.Iterator {


    @Override
    public boolean hasNext() {
        if (this.next() !=null){
            return true;
        }
        return false;
    }


    @Override
    public Object next() {
        this.next();
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
