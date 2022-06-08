package org.zhouhy.concurrency.phase01.ch01;

import org.zhouhy.concurrency.phase01.App;

public class ReadAndWriteTest extends App {

    public static void main(String[] args) {
        ReadThread r1 = new ReadThread("Read Thread");
        WriteRunnable runnable = new WriteRunnable();
        Thread w1 = new Thread(runnable,"Write Thread"); 
        
        r1.start();
        w1.start();
    }
}
