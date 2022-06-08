package org.zhouhy.concurrency.phase01;

public class App {
    protected static void println(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        try {
            Thread.sleep(1000*300L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
