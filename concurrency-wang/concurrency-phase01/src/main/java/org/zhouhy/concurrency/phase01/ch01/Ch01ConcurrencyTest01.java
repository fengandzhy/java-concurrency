package org.zhouhy.concurrency.phase01.ch01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zhouhy.concurrency.phase01.App;

public class Ch01ConcurrencyTest01 extends App {
    
    private static final Logger logger = LoggerFactory.getLogger(Ch01ConcurrencyTest01.class);
        
    public static void main(String[] args) {
        Thread t1 = new Thread(
                () ->{
                    for(int i =0;i < 100;i++){
                        println("Task 1=>" +i);
                    }
                }
        );
        t1.setName("Customer Thread");
        t1.start();
        logger.info("We are here!!");
    }
}
