package com.concurrent.test.a.theadrunnable;

/**
 * @Author: gang.liu
 * @Date: 2019/1/17 11:12
 */
public class ThreadInstance extends Thread {

    public ThreadInstance(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+"这是实现Thread的方法");
    }
}
