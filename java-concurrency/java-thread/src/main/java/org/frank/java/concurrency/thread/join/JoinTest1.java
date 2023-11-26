package org.frank.java.concurrency.thread.join;


import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.JoinTest")
public class JoinTest1 {
    private static int result = 0;
    public static void main(String[] args) throws InterruptedException {        
        Thread t1 = new Thread(()-> {
            log.debug("Thread is running.");
            try {
                Thread.sleep(5000);
                result = 2;
                log.debug("Thread is finished.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.setName("t1");
        t1.start();
        log.debug("before join result=" + result);
        t1.join(); // 在这里等待t1 完成
        log.debug("after join result=" + result);
    }   
}
