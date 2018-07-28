package com.thread3;

public class Resource {
    private String name;
    private int cout;

    /*
     * 提供给商品赋值的方法
     * */
    public void setPro(String name) {
        this.name = name + "------" + cout;
        cout++;
        System.out.println(Thread.currentThread().getName() + "----------生产者---------" + this.name );
    }


    /*提供获取商品的方法*/
    public void getPro() {
        System.out.println(Thread.currentThread().getName() + "-------消费者------" + this.name );
    }

}
