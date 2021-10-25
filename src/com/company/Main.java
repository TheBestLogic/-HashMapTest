package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Task 1.3");
        Random rand = new Random();
        int DelNumber = rand.nextInt(100), ARR_SIZE = 100;
        int[] Array = new int[ARR_SIZE];
        for( int i = 0; i < ARR_SIZE; ++i)
        {
            Array[i] = rand.nextInt(100);
        }
        printArr(Array, ARR_SIZE);
        LinkedList<Integer> IndexForDel = new LinkedList<Integer>();
        for( int i = 0; i < ARR_SIZE; ++i)
        {
            if( DelNumber == Array[i] )
                IndexForDel.addLast(i);
        }
        if (IndexForDel.isEmpty())
        {
            System.out.println("Elements not found.");
            return;
        }
        else
        {
            getNewArr(Array,ARR_SIZE, IndexForDel);
        }
    }

    public static void getNewArr(int[] _Array, int _ARR_SIZE, LinkedList<Integer> _IndexForDel)
    {
        int NEW_ARR_SIZE = _ARR_SIZE - _IndexForDel.size();
        int NeedRemIndex = _IndexForDel.removeFirst();
        int[] NewArray = new int[NEW_ARR_SIZE];
        for (int i = 0, j = 0; i < NEW_ARR_SIZE; ++i, ++j)
        {
            if(NeedRemIndex == j){
                ++j;
                if(!_IndexForDel.isEmpty())
                {
                    NeedRemIndex = _IndexForDel.removeFirst();
                }
            }
            NewArray[i] = _Array[j];
        }
        printArr(NewArray, NEW_ARR_SIZE);
    }

    public static void printArr(int[] Arr, int size)
    {
        System.out.println("\n");
        for(int i = 0; i < size; ++i)
        {
            System.out.print(Arr[i] + " ");
        }
        System.out.println("\n");
    }
}
