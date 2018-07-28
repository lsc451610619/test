package com.thread3;

public class Customer implements Runnable {

    Resource res;
    Customer(Resource res) {
        this.res = res;
    }
    @Override
    public void run() {
        res.getPro();
    }
}
