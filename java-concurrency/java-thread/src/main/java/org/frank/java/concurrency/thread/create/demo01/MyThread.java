package org.frank.java.concurrency.thread.create.demo01;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("This is my Thread.");
    }
}
