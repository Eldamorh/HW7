package com.eldus;

public class IntStack3TaskImpl implements IntStack{

    int[] array;
    int size = 0;

    IntStack3TaskImpl(int value, int capacity) {
        array = new int[capacity];
        push(value);
    }

    IntStack3TaskImpl(int[] array,int capacity) {
        this.array = new int[capacity];
        for (int i : array) {
            push(i);
        }
    }

    @Override
    public void push(int value) {
        if (size == array.length) {
            int[] newArray = new int[array.length];
            System.arraycopy(array, 1, newArray, 0, size - 1);
            array = newArray;
            array[array.length-1] = value;
        }else{
            array[size] = value;
            size++;
        }

    }

    @Override
    public int pop() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else {
            size--;
            return array[size];
        }
    }

    @Override
    public int peek() {
        return array[size - 1];
    }

}
