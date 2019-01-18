package com.concurrent.test.d.waitnotify;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 9:45
 */
public class NotifyTest {

    public static void main(String[] args) {
        NotifyThread threadInstance = new NotifyThread();
        Thread thread = new Thread(threadInstance);
        synchronized (thread) {
            System.out.println("thread start");
            thread.start();
            System.out.println("thread started");
            try {
                System.out.println("thread wait");
                thread.wait();
                System.out.println("thread continue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
