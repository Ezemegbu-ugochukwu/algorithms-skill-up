package com.ugo;

public class Queue {

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        queue.print();
    }

    private int [] data;
    private static final int DEFAULT_SIZE = 10;
    private int end;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.data =  new int[size];
        end = 0;
    }

    private boolean isFull(){
        return end == data.length;
    }
    private boolean isEmpty(){
        return end == -1;
    }

    public boolean insert(int value){
        if (isFull()){
            return false;
        }
        data[end] = value;
        end++;
        return true;
    }

    public int remove(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        int remove = data[0];

        for (int i = 1; i < end; i++){
            data[i - 1] = data[i];
        }
        end--;
        return remove;
    }
    public int front(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        return data[0];
    }

    public void print(){
        for (int i = 0; i < end; i++){
            System.out.print(data[i] + "<-");
        }
        System.out.println("END");
    }
}
