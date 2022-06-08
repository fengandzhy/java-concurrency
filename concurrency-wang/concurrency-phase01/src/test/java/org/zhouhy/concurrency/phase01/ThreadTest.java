package org.zhouhy.concurrency.phase01;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class ThreadTest {

    private static CountDownLatch latch = new CountDownLatch(1); // 起几个线程这里的数字就是几
    
    @Test
    public void test1() throws InterruptedException{
        Thread t1 = new Thread(()-> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1111");
            latch.countDown(); // 本线程运行完成之后数字减一           
        });
        t1.start();        
        System.out.println("333333333333333");        
        latch.await(); // 当数字为0时不再等，结束.       
    }
}
