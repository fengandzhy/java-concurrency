package org.frank.java.concurrency.thread.create.demo02;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.ThreadCreation2")
public class ThreadCreation2 {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();        
        Thread t2 = new Thread(runnable);
        t2.setName("t2");
        t2.start();        
    }
}
