package com.thread2;

public class DeadLock implements Runnable {
    boolean flag;

    DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (Lock.lockA) {
                System.out.println("这里是 if 的 A 锁进来了");
                synchronized (Lock.lockB) {
                    System.out.println("这里是 if 的  B  锁进来了 ");
                }
            }
        } else {
            synchronized (Lock.lockB) {
                System.out.println("这里是 else 的 B 锁进来了");
                synchronized (Lock.lockA) {
                    System.out.println("这里是 else 的  A 锁进来了 ");
                }
            }

        }

    }
}
