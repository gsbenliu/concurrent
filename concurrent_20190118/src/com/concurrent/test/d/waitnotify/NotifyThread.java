package com.concurrent.test.d.waitnotify;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 9:35
 */
public class NotifyThread implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("同步唤醒其他线程");
            notify();
        }
    }
}
