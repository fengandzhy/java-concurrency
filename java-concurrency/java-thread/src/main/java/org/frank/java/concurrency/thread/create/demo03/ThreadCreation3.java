package org.frank.java.concurrency.thread.create.demo03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCreation3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        Thread t3 = new Thread(futureTask);
        t3.setName("t3");
        t3.start();  
        
        System.out.println(futureTask.get()); // 这里取到线程运行的结果
    }
}
