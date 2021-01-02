package com.eldus;

public class IntStackImpl implements IntStack {

    int[] array;
    int size = 0;


    IntStackImpl(int value) {
        array = new int[10];
        push(value);
    }

    IntStackImpl(int[] array) {
        this.array = new int[10];
        for (int i : array) {
            push(i);
        }
    }

    @Override
    public void push(int value) {
        if (size == array.length / 2) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size] = value;
        size++;
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
