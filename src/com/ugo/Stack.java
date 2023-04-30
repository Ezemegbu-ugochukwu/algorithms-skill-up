package com.ugo;

public class Stack {

    public static void main(String[] args) {
       Stack stack = new Stack(3);
       stack.push(12);
       stack.push(13);
       stack.push(14);
       stack.push(14);
       stack.push(14);
       stack.push(14);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }

    public int [] data;
    public static final int DEFAULT_SIZE = 10;
    private int ptr;

    public Stack(){
        this(DEFAULT_SIZE);
    }


    public Stack(int size) {
        this.data = new int[size];
        ptr = -1;
    }

    public boolean push(int value) {
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
       int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
       return  data[ptr];
    }


    private boolean isEmpty() {
        return ptr == -1;
    }

    boolean isFull() {
        return ptr == data.length - 1;
    }
}
