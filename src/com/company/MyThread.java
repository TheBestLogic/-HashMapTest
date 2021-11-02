package com.company;

public class MyThread extends Thread{
    protected Object lock;

    public MyThread()
    {
        lock = null;
        setName("No name");
    }
    public MyThread(Object _lock, String _name)
    {
        lock = _lock;
        setName(_name);
    }

    @Override
    public void run() {
        synchronized (lock)
        {
            System.out.println(getName());
        }

    }
}
