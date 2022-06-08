package org.zhouhy.concurrency.phase01.ch01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadThread extends Thread{
    
    private static final Logger logger = LoggerFactory.getLogger(ReadThread.class);

    public ReadThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        logger.info("Begin to read...");
        try {
            Thread.sleep(1000*10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("Read End.");
    }
}
