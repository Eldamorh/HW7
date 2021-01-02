package com.eldus;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        IntStack stack = new IntStackImpl(10);
//        stack.push(5);
//        stack.push(2);
//        stack.push(1);
//        stack.push(1);
//        stack.push(10);
//        stack.push(4);
//        stack.push(3);
//        stack.push(3);
//        stack.push(3);
//        stack.push(3);
//        stack.push(3);
//        for(int i = 0;i < 12;i++){
//            System.out.println(stack.pop());
//        }
//        int[] arr = new int[10];
//        for(int i = 0; i < 10; i++){
//            arr[i] = i;
//        }
//        IntStack stack2 = new IntStackImpl(arr);
//        for(int i = 0;i < 10;i++){
//            System.out.println(stack2.pop());
//        }
//        IntList list = new ArrayIntList(10);
//        list.add(9);
//        list.add(8);
//        list.add(7);
//        list.add(6);
//        list.add(5);
//        list.add(4);
//        list.add(3);
//        list.add(2);
//        list.add(1);
//        list.add(0);
//
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list.size() + " " + list.capacity());
//        list.insert(4, 98976);
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list.size() + " " + list.capacity());
//        list.removeByIndex(4);
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list.size() + " " + list.capacity());
//        IntList list1 = list.subList(4, 10);
//        System.out.println(Arrays.toString(list1.toArray()));
//        System.out.println(list1.size() + " " + list1.capacity());

        IntStack3TaskImpl stack3 = new IntStack3TaskImpl(10,10);
        stack3.push(9);
        stack3.push(8);
        stack3.push(7);
        stack3.push(6);
        stack3.push(5);
        stack3.push(4);
        stack3.push(3);
        stack3.push(2);
        stack3.push(1);
        System.out.println(Arrays.toString(stack3.array));
        stack3.push(657);
        System.out.println(Arrays.toString(stack3.array));



    }
}
