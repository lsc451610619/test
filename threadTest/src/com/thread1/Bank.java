package com.thread1;

public class Bank {
    private Integer sum = 0;

    public void total(Integer money) {
        sum = sum + money;
        System.out.println(sum);
    }
}
