package com.concurrent.test.b.runstart;

/**
 * @Author: gang.liu
 * @Date: 2019/1/17 14:01
 */
public class RunnableInstance implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable instance run method");
    }
}
