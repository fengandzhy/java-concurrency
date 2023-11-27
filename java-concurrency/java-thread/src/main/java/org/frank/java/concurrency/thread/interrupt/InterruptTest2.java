package org.frank.java.concurrency.thread.interrupt;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.InterruptTest2")
public class InterruptTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
           while(true){
               boolean isInterrupted = Thread.currentThread().isInterrupted();
               if(isInterrupted){
                   log.debug("The thread is terminated.");
                   break;
               }
           }
        });
        t1.setName("t1");
        t1.start();
        log.debug("is running here.");
        Thread.sleep(3000);
        t1.interrupt();
    }
}
