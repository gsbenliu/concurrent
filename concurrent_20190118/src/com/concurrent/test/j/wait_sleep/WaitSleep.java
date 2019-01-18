package com.concurrent.test.j.wait_sleep;

/**
 * @Author: gang.liu
 * @Date: 2019/1/16 16:47
 */
public class WaitSleep {


    public static void main(String[] args) {

        new Thread(new ThreadWait()).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new ThreadSleep()).start();
    }


    static class ThreadWait implements Runnable {

        @Override
        public void run() {
            synchronized (WaitSleep.class) {
                System.out.println("ThreadWait 开始执行");
                System.out.println("ThreadWait 等待中");

                try {
                    WaitSleep.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("ThreadWait 继续执行");
                System.out.println("ThreadWait 执行完毕");
            }
        }
    }

    static class ThreadSleep implements Runnable {

        @Override
        public void run() {
            synchronized (WaitSleep.class) {
                System.out.println("ThreadSleep 开始执行");
                System.out.println("ThreadSleep 等待中");
//                WaitSleep.class.notify();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("ThreadSleep 继续执行");
                System.out.println("ThreadSleep 执行完毕");
            }
        }
    }
}
