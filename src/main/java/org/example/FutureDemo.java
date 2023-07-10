package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    private static ExecutorService exec = Executors.newSingleThreadExecutor();

    public static Future<String> capitalize(String s) {
        return exec.submit(() -> {
            Thread.sleep(1000);
            return s.toUpperCase();
        });
    }
}
