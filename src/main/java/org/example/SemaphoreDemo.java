package org.example;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    static Semaphore sem = new Semaphore(2, true);
    public static void main(String[] args) throws InterruptedException {
        MyThread t0 = new MyThread(sem);
        MyThread t1 = new MyThread(sem);
        MyThread t2 = new MyThread(sem);

        t0.start();
        t1.start();
        t2.start();

        t0.join();
        t1.join();
        t2.join();
    }
}
