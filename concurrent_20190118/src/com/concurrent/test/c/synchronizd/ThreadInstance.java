package com.concurrent.test.c.synchronizd;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 9:07
 */
public class ThreadInstance implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000);
                System.out.println("执行循环结果" + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
