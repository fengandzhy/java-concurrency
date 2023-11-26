package org.frank.java.concurrency.thread.create.demo03;

import java.util.concurrent.Callable;


public class MyCallable implements Callable<String> {
    @Override
    public String call() throws InterruptedException {
        System.out.println("Running....");
        Thread.sleep(1000);
        return "complete!";
    }
}
