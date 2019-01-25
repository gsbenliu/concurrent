package com.concurrent.test.e.threadyield;

/**
 * @Author: gang.liu
 * @Date: 2019/1/21 15:41
 */
public class ThreadInstance extends Thread {

    int i = 0;
    Test test;


    public ThreadInstance(String name, Test test) {
        super(name);
        this.test = test;
    }

    @Override
    public void run() {
        synchronized (test) {
            while (true) {
                i++;
                if (i == 10) {
                    break;
                }
                if (i % 4 != 0) {
                    continue;
                }
                System.out.println(Thread.currentThread().getName() + " 开始执行线程处理 " + i + "  " + Thread.currentThread().getState());
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + " 开始执行线程中断处理 " + i + "  " + Thread.currentThread().getState());
            }
        }
    }
}
