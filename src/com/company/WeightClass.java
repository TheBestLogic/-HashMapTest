package com.company;

import java.util.Random;

public class WeightClass {
    private int[] valueArr;
    private int[] weightArr;
    private  int[] probabilityArr;
    private int otherWeight = 0;


    public WeightClass()
    {
        valueArr = new int[10];
        weightArr = new int[10];
    }

    public WeightClass(int[] _valueArr, int[] _weightArr)
    {
        valueArr = _valueArr;
        weightArr = _weightArr;
        getProbabilityArr();
    }

    public void setRandVal()
    {
        Random rnd = new Random();
        for (int i = 0; i < 10; ++i)
        {
            valueArr[i] = rnd.nextInt(10);
            weightArr[i] = rnd.nextInt(10)+1;
        }
        getProbabilityArr();
    }

    public void  printArrs()
    {
        System.out.print("\n");
        for (int i = 0; i < 10; ++i)
            System.out.print(valueArr[i] + " ");
        System.out.print("\n");
        for (int i = 0; i < 10; ++i)
            System.out.print(weightArr[i] + " ");
        System.out.print("\n");
    }

    public void getRandomVal()
    {
        Random rnd = new Random();
        int i = rnd.nextInt(otherWeight);
        System.out.println(valueArr[probabilityArr[i]] + "   " + weightArr[probabilityArr[i]]);
    }

    private void getProbabilityArr()
    {
        for( int i = 0; i < 10; ++i)
            otherWeight += weightArr[i];
        probabilityArr = new int[otherWeight];
        for( int i = 0, probIndex = 0; i < 10; ++i)
        {
            for(int j = 0; j < weightArr[i]; ++j, ++probIndex)
            {
                probabilityArr[probIndex] = i;
            }
        }
    }
}
