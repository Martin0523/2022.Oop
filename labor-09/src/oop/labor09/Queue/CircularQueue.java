package oop.labor09.Queue;

public class CircularQueue implements IQueue{
    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.front = -1;
        this.rear = -1;
        items = new Object[CAPACITY];
    }

    @Override
    public boolean isEmpty() {
        if (front == -1){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (front == 0 && rear == CAPACITY -1){
            return true;
        }
        if (front == rear +1){
            return true;
        }
        return false;
    }

    @Override
    public void enQueue(Object newObj) {
        if (!isFull()){
            if (front == -1){
                front = 0;
            }
            rear = (rear + 1) % CAPACITY;
            items[rear] = newObj;
        }
    }

    @Override
    public Object deQueue() {
        Object temp;
        if (!isEmpty()){
            temp = items[front];
            if (front == rear){
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % CAPACITY;
            }
            return temp;
        }
        return null;
    }

    @Override
    public void printQueue() {
        if (!isEmpty()){
            for (int i = front; i != rear; i = (i + 1) % CAPACITY){
                System.out.println(items[i]);
            }
        }
        else {
            System.out.println("Queue is empty!");
        }
    }
}
