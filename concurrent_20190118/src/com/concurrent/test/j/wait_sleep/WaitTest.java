package com.concurrent.test.j.wait_sleep;

/**
 * @Author: gang.liu
 * @Date: 2019/1/21 16:26
 */
public class WaitTest {
    public static void main(String[] args) throws Exception {

        WaitTest waitTest = new WaitTest();

        WaitInstance waitInstance1 = new WaitInstance(" thread1 ", waitTest);
        WaitInstance waitInstance2 = new WaitInstance(" thread2 ", waitTest);
        WaitInstance waitInstance3 = new WaitInstance(" thread3 ", waitTest);

        waitInstance1.start();
        waitInstance2.start();
        waitInstance3.start();

        Thread.sleep(10000);

        synchronized (waitTest) {
            System.out.println("执行notifyAll");
            waitTest.notifyAll();
        }
    }

    static class WaitInstance extends Thread {

        WaitTest waitTest;

        public WaitInstance(String name, WaitTest waitTest) {
            super(name);
            this.waitTest = waitTest;
        }

        @Override
        public void run() {
            synchronized (waitTest) {
                System.out.println("开始执行同步锁内容");
                try {
                    waitTest.wait();
                    System.out.println("执行同步锁内容,wait已经执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
