package com.thread3;

public class main {

    public static void main(String[] args) {
        Resource res = new Resource();

        Produce pro = new Produce(res);
        Customer con = new Customer(res);

        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(con);

        t1.start();
        t2.start();

    }

}
