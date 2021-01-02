package com.eldus;

import java.util.Arrays;

public class ArrayIntList implements IntList {
    int[] array = new int[10];
    int size = 0;

    ArrayIntList(int value) {
        add(value);
    }

    ArrayIntList(int[] array) {
        for (int i : array) {
            add(i);
        }
    }


    @Override
    public void add(int i) {
        if (size == array.length / 2) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size] = i;
        size++;
    }

    @Override
    public void insert(int index, int value) {

        if (index <= size) {
            int[] newArray = new int[array.length];
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = value;
            System.arraycopy(array, index, newArray, index + 1, size - index);
            size++;
            array = newArray;
        }


    }

    @Override
    public void set(int index, int value) {
        if (index <= size) {
            array[index] = value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return array.length;
    }

    @Override
    public int getByIndex(int index) {
        return array[index];
    }

    @Override
    public Integer getIndexByValue(int value) {
        for (int i : array) {
            if (i == value) {
                return i;
            }
        }
        return null;
    }

    @Override
    public boolean contains(int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void removeValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                int[] newArray = new int[array.length];
                System.arraycopy(array, 0, newArray, 0, i);
                System.arraycopy(array, i + 1, newArray, i, size - i);
                size--;
                array = newArray;
            }
        }


    }

    @Override
    public void removeByIndex(int index) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, size - index);
        size--;
        array = newArray;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        int[] newArray = new int[toIndex - fromIndex];
        System.arraycopy(array, fromIndex, newArray, 0, toIndex - fromIndex);
        IntList temp = new ArrayIntList(newArray);
        return temp;
    }

    @Override
    public int[] toArray() {
        int[] newArray = new int[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }
}
