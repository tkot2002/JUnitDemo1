package org.example;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread {

    Semaphore sem;

    public MyThread(Semaphore sem) {
        this.sem = sem;
    }

    public void run() {
        System.out.println(this.getName() + " is starting...");

        try {
            sem.acquire();
        } catch (InterruptedException e) {}

        for (int i = 1; i < 4; i++) {
            System.out.println(this.getName() + " prints " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }

        sem.release();

    }
}
