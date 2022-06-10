package org.zhouhy.concurrency.phase01.ch04;

import org.zhouhy.concurrency.phase01.FrankThread;

public class Bank {
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            TicketWindowRunnable runnable = new TicketWindowRunnable();
            Thread thread = new FrankThread(runnable,"窗口"+(i+1));
            thread.start();
        }
    }    
}
