package com.concurrent.test.a.theadrunnable;

/**
 * @Author: gang.liu
 * @Date: 2019/1/17 11:13
 */
public class RunnableInstance implements Runnable {

    private int a = 10;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"这是实现runnable接口的方法" + a--);
    }
}
