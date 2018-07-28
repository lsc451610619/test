package com.thread1;

public class TicketsDemo {

    public static void main(String[] args) {
        SaleTickets st = new SaleTickets();

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        Thread t3 = new Thread(st);
        Thread t4 = new Thread(st);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
