package org.zhouhy.concurrency.phase01;

public class App {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1111");
        });
        t1.start();        
        System.out.println("2222222222");
    }
}
