package com.concurrent.test.j.wait_sleep;

/**
 * @Author: gang.liu
 * @Date: 2019/1/21 16:27
 */
public class SleepTest {


    public static void main(String[] args) {
        SleepInstance sleepInstance1 = new SleepInstance(" thread1 ");
        sleepInstance1.start();
        SleepInstance sleepInstance2 = new SleepInstance(" thread2 ");
        sleepInstance2.start();
        SleepInstance sleepInstance3 = new SleepInstance(" thread3 ");
        sleepInstance3.start();
    }

    static class SleepInstance extends Thread {

        public SleepInstance(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (SleepTest.class) {
                try {
                    System.out.println(Thread.currentThread().getName() + "开始线程休眠");
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName() + "线程休眠结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
