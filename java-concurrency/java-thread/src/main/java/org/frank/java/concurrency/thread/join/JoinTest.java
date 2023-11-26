package org.frank.java.concurrency.thread.join;

import java.util.concurrent.atomic.AtomicInteger;

public class JoinTest {
    private static int result = 0;
    public static void main(String[] args) throws InterruptedException {        
        Thread t1 = new Thread(()-> {
            System.out.println("Thread is running.");
            try {
                Thread.sleep(5000);
                result = 2;
                System.out.println("Thread is finished.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.setName("t1");
        t1.start();
        System.out.println(result);
        t1.join();
        System.out.println(result);
    }   
}
