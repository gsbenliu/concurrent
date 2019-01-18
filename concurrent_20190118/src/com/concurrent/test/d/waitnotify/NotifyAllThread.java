package com.concurrent.test.d.waitnotify;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 9:53
 */
public class NotifyAllThread implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
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
