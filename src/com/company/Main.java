package com.company;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Task 3.0");
        Random r = new Random();
        int[] Array = new int[100000];
        for (int i = 0; i < 100000 ; ++i)
            Array[i] = r.nextInt(600);
        Arrays.sort(Array);
        int isSearch = 0;
        long time = System.currentTimeMillis();
        isSearch = SearchInArray.search(Array, 100000, 300);
        System.out.println(System.currentTimeMillis() - time);
        System.out.println(isSearch);
        time = System.currentTimeMillis();
        isSearch = SearchInArray.binarySearch(Array, 100000, 300);
        System.out.println(System.currentTimeMillis() - time);

        System.out.println(isSearch);
    }
}
