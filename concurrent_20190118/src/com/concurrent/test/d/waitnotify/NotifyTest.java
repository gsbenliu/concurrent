package com.concurrent.test.d.waitnotify;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 9:45
 */
public class NotifyTest {

    public static void main(String[] args) {
        NotifyThread threadInstance = new NotifyThread(" NotifyThread");
        synchronized (threadInstance) {
            System.out.println(threadInstance.getName() + " thread start " + threadInstance.getState());
            threadInstance.start();
            System.out.println(threadInstance.getName() + " thread started " + threadInstance.getState());

//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            try {
                System.out.println(Thread.currentThread().getName() + " thread wait");
                threadInstance.wait();
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName() + " thread continue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
