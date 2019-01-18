package com.concurrent.test.d.waitnotify;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 9:53
 */
public class NotifyAllTest {

    public static void main(String[] args) {
        Thread thread = new Thread(new NotifyAllThread());
        synchronized (thread) {
            System.out.println("thread is start");
            thread.start();
            System.out.println("thread is started");

            try {
                System.out.println("thread is wait");
                thread.wait();
                System.out.println("thread is continue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread is close");
        }
    }
}
