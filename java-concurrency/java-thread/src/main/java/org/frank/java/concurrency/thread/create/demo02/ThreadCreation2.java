package org.frank.java.concurrency.thread.create.demo02;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.ThreadCreation2")
public class ThreadCreation2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log.info(" is running");
            }
        };
        
        Thread thread = new Thread(runnable);
        thread.setName("t2");
        thread.start();        
    }
}
