package com.ugo;

public class DynamicStack extends Stack{

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack(3);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(14);
        stack.push(14);
        stack.push(14);
    }

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int value) {
        if (this.isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(value);
    }
}
