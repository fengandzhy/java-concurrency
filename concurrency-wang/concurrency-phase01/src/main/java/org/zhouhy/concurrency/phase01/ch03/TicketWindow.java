package org.zhouhy.concurrency.phase01.ch03;

import org.zhouhy.concurrency.phase01.FrankThread;

public class TicketWindow extends FrankThread {   
    
    private static int MAX = 10000;
    
    private static int INDEX = 0;
    
    private String name;
    
    public TicketWindow(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        while(INDEX <= MAX){
            println(name + " 处理到了 "+ INDEX);
            INDEX ++;
        }
    }
}
