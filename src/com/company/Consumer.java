package com.company;

import java.util.LinkedList;

public class Consumer  extends MyThread{
    private  LinkedList<Integer> Queue = new LinkedList<>();


    public  Consumer(LinkedList<Integer> _Queue)
    {
        Queue = _Queue;
    }

    @Override
    public void run() {
        int val = 0;
        while (true) {
            try {
                val = consume();
                if (val != -1)
                    System.out.println("Consumed: " + val);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int consume() throws InterruptedException {
        synchronized (Queue) {
            if (Queue.isEmpty()) {
                return -1;
            }
            return Queue.poll();
        }
    }
}
