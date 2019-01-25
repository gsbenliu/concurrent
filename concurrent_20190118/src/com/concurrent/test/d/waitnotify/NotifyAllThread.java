package com.concurrent.test.d.waitnotify;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 9:53
 */
public class NotifyAllThread extends Thread {
    @Override
    public void run() {
        System.out.println("enter NotifyAllThread run method");
        synchronized (this) {
            System.out.println("get NotifyAllThread obj lock");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            notifyAll();
            System.out.println("唤醒所有等待线程");
        }
    }
}
