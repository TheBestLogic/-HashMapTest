package com.company;

import java.util.LinkedList;
import java.util.Random;

public class Producer  extends MyThread{
    private  LinkedList<Integer> Queue = new LinkedList<>();
    private int Size = 30;

    public  Producer(LinkedList<Integer> _Queue)
    {
        Queue = _Queue;
    }


    @Override
    public void run() {
        int val = 0;
        while (true) {
            try {
                val = produce();
                if ( val != -1)
                    System.out.println("Produced: " + val );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int produce() throws InterruptedException
    {
        boolean f = true;
        synchronized(Queue){
            f = (Queue.size() == Size) ? false : true;
        }
        if(!f)
            return  -1;
        Random r = new Random();
        int val = r.nextInt(300);
        synchronized(Queue){
            Queue.add(val);
        }
        return val;
    }

}
