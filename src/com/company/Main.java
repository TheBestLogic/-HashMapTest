package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Task 2.2");
        MyLinkedList<Integer> I = new MyLinkedList<Integer>();

        I.add(35);
        I.add(55);
        I.add(5);
        I.add(3);
        System.out.println(I.getLast());
    }
}
