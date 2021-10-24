package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Start");
        int ARRAY_LENGHT = 50;
        double max = 0, min = 1, avg = 0;
        double[] Array = new double[ARRAY_LENGHT];
        for (int i = 0; i < ARRAY_LENGHT; ++i)
        {
            Array[i] = Math.random();
            if( max < Array[i] )
                max = Array[i];
            if( min > Array[i])
                min = Array[i];
            avg += Array[i];
        }
        avg /= ARRAY_LENGHT;
        System.out.println("Max = "+ max + ";\nMin = " + min + ";\nAvg = "+ avg +";");
    }
}
