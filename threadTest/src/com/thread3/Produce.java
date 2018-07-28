package com.thread3;

public class Produce implements Runnable {
    Resource res;

    Produce(Resource res) {
        this.res = res;
    }

    @Override
    public void run() {
        res.setPro("商品");
    }
}
