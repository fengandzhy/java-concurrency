package org.frank.java.concurrency.thread.create.demo01;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.createThread1")
public class createThread1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            log.info("We are running");
        });
        t1.setName("t1");
        t1.start();
    }    
}
