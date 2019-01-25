package com.concurrent.test.g.threadjoin;

/**
 * @Author: gang.liu
 * @Date: 2019/1/21 16:59
 */
public class ThreadInstance extends Thread {

    int timeout;

    public ThreadInstance(String name, int timeout) {
        super(name);
        this.timeout = timeout;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "执行子线程需要" + timeout / 1000 + "S");
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + "子线程执行完毕");
    }
}
