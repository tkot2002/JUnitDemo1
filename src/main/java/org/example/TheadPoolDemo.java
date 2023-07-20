package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheadPoolDemo {

    static int count = 0;
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable task = () -> {
                System.out.println(Thread.currentThread().getName() +  " is calling increment().");
                increment();
                System.out.println("Count is now " + count);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };
            exec.submit(task);
        }
        //System.out.println(count);
    }

    public static void increment() {
        count++;
    }
}
