package com.concurrent.test.h.threadinterrupt;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 15:14
 */
public class Test {
    public static void main(String[] args) {
        ThreadInstance threadInstance = new ThreadInstance("MyThread");
        threadInstance.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadInstance.interrupt();
    }
}
