package com.concurrent.test.h.threadinterrupt;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 15:14
 */
public class ThreadBlockTest {
    public static void main(String[] args) {
        ThreadBlockInstance threadInstance = new ThreadBlockInstance("MyThread");
        threadInstance.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadInstance.interrupt();
    }
}
