package oop.labor09.Queue;

public interface IQueue {

    boolean isEmpty();
    boolean isFull();
    void enQueue(Object newObj);
    Object deQueue();
    void printQueue();

}