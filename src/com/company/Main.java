package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Task 1.1");
        int ARRAY_LENGHT = 50;
        double[] Array = new double[ARRAY_LENGHT];
        for (int i = 0; i < ARRAY_LENGHT; ++i)
        {
            Array[i] = Math.random();
        }
    }
}
