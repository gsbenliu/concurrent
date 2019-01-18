package com.concurrent.test.c.synchronizd;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 9:05
 */
public class ThreadLockInstance implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(5000);
                    System.out.println("执行锁内循环结果" + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void start() {
        System.out.println("thread it not synchronized method");
    }


    public synchronized void lock() {
        System.out.println("the method has locked");
    }
}
