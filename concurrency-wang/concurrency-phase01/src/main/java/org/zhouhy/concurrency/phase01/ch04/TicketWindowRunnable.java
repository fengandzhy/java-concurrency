package org.zhouhy.concurrency.phase01.ch04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TicketWindowRunnable implements Runnable{

    private static final Logger logger = LoggerFactory.getLogger(TicketWindowRunnable.class);
    
    private static int MAX = 10000;

    private static int INDEX = 0;
    
    @Override
    public void run() {
        while(INDEX <= MAX){
            logger.info(Thread.currentThread() + " 处理到了 "+ INDEX);
            INDEX ++;
        }
    }
}
