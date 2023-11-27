package org.frank.java.concurrency.thread.interrupt;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.InterruptTest1")
public class InterruptTest1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            log.debug("thread is running");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.setName("t1");
        t1.start();
        Thread.sleep(1000);
        log.debug("interrupt");
        t1.interrupt();
        log.debug("打断标记:{}",t1.isInterrupted());
    }
}
