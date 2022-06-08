package org.zhouhy.concurrency.phase01.ch01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WriteRunnable implements Runnable{

    private static final Logger logger = LoggerFactory.getLogger(WriteRunnable.class);    

    @Override
    public void run() {
        logger.info("Begin to write...");
        try {
            Thread.sleep(1000*10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("Write End.");
    }
}
