package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Task 1.2");
        for(int i = 2; i <= 100; i ++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
