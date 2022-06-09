package org.zhouhy.concurrency.phase01.ch03;

public class Bank {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            TicketWindow ticketWindow = new TicketWindow(" 窗口"+(i+1));
            ticketWindow.start();
        }
    }
}
