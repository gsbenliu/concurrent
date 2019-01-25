package com.concurrent.test.d.waitnotify;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 9:35
 */
public class NotifyThread extends Thread {

    public NotifyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " enter thread " + Thread.currentThread().getState());
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " enter thread  lock method " + Thread.currentThread().getState());
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName() + " 同步唤醒其他线程 " + Thread.currentThread().getState());
//            notify();
            System.out.println(Thread.currentThread().getName() + " enter thread  lock method is over " + Thread.currentThread().getState());
        }
    }
}
