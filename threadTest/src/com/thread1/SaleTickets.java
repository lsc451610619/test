package com.thread1;

public class SaleTickets implements Runnable {
    private int tickets = 100;

    Object ob = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized (ob) {
                try {
                    Thread.sleep(10);//让线程稍微听一下
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "...." + tickets--);
                }
            }
        }
    }
}
