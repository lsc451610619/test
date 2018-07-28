package com.thread2;

public class main {

    public static void main(String[] args) {
        DeadLock d1 = new DeadLock(true);
        DeadLock d2 = new DeadLock(false);
        new Thread(d1).start();
        new Thread(d2).start();
    }
}
