package com.company;

public class SearchInArray {

    public static int search(int[] Array, int len, int obj)
    {
        for (int i = 0; i < len; ++i)
        {
            if (Array[i] == obj)
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] Array, int len, int obj)
    {
        return recursSearch( Array, obj,0, len);
    }

    private static int recursSearch(int[] Array, int obj,int start, int end)
    {
        int middle = (start + end) / 2;

        if (end < start) {
            return -1;
        }
        if (start < 0) {
            return -1;
        }
        if (obj == Array[middle]) {
            return middle;
        } else if (obj < Array[middle]) {
            return recursSearch( Array, obj, start, middle - 1);
        } else {
            return recursSearch( Array, obj, middle + 1, end);
        }
    }

}
