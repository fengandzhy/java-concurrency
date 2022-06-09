package org.zhouhy.concurrency.phase01;

public class FrankThread extends Thread {

    public FrankThread() {
    }

    public FrankThread(Runnable target) {
        super(target);
    }

    public FrankThread(String name) {
        super(name);
    }

    public FrankThread(Runnable target, String name) {
        super(target, name);
    }

    protected static void println(String message){
        System.out.println(message);
    }
}
