package com.thread1;

public class Customer implements Runnable {
    private Bank bank = new Bank();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            bank.total(100);
        }

    }
}
