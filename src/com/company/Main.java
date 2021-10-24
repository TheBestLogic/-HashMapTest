package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Task 1.1");
        int ARRAY_LENGTH = 50;
        double[] Array = new double[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; ++i)
        {
            Array[i] = Math.random();
        }
        double buf = 0;
        for (int i = ARRAY_LENGTH- 1; i >= 1; --i)
        {
            for (int j = 0; j < i; j++)
            {
                if(Array[j] > Array[j + 1])
                {
                    buf = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = buf;
                }

            }
        }
        System.out.println("Array[0] = " + Array[0] + "\nArray[ARRAY_LENGTH-1] = " + Array[ARRAY_LENGTH-1]);
    }
}
