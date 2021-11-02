package com.company;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Thread tasks");
        System.out.println("Выведите состояние потока перед его запуском, после запуска и во время выполнения.");
        Runnable r1 = ()->{
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        };
        Thread task8_0 = new Thread(r1,"MyThread");
        System.out.println(task8_0.getState());
        task8_0.start();

        try{
            Thread.sleep(600);
        }
        catch(InterruptedException e){
            System.out.println("Main thread has been interrupted");
        }
        System.out.println(task8_0.getState());
        System.out.println("Thread task 8.1");
        System.out.println("Напишите программу, в которой создаются два потока, которые выводят на консоль своё имя по очереди.");
        Object lock = new Object();
        MyThread T1 = new MyThread(lock,"My T1 thread");
        MyThread T2 = new MyThread(lock,"My T2 thread");
        T1.start();
        T2.start();//вроде я не закрыл их
        System.out.println("Thread task 8.2");
        System.out.println("Дано два потока — производитель и потребитель.\n" +
                " Производитель генерирует некоторые данные (в примере — числа). Производитель «потребляет» их.\n" +
                "Два потока разделяют общий буфер данных, размер которого ограничен. \n" +
                "Если буфер пуст, потребитель должен ждать, пока там появятся данные. \n" +
                "Если буфер заполнен полностью, производитель должен ждать, пока потребитель заберёт данные и место освободится.");
        LinkedList<Integer> Queue = new LinkedList<>();
        Thread prodThread = new Thread(new Producer(Queue), "Producer");
        Thread consThread = new Thread(new Consumer(Queue), "Consumer");
        prodThread.start();
        consThread.start();
    }



}
