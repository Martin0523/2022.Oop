package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private int capacity;

    public StackInheritance(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return size() == capacity;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void push(Object obj){
        if (!isFull()){
            add(obj);
            //super.add(obj);
        }
    }

    public void pop(){
        if (!isEmpty()){
            remove(size()-1);
        }
    }

    public Object top(){
        if (!isEmpty()){
            return get(size()-1);
        }
        return null;
    }

    public int getSize(){
        return size();
    }
}
