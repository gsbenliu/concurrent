package com.concurrent.test.b.runstart;

/**
 * @Author: gang.liu
 * @Date: 2019/1/17 14:00
 */
public class ThreadInstance extends Thread {

    @Override
    public void run() {
        System.out.println("Thread instance run method");
    }

    public ThreadInstance(String name) {
        super(name);
    }
}
