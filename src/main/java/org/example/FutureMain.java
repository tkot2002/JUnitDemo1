package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class FutureMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Future<String> future = FutureDemo.capitalize("tushar!");

        while(!future.isDone()) {
            System.out.println("loading...");
            Thread.sleep(300);
        }

        System.out.println(future.get());
        System.exit(0);

    }
}
