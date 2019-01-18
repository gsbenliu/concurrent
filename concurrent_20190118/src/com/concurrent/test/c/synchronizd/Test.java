package com.concurrent.test.c.synchronizd;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 9:08
 */
public class Test {

    public static void main(String[] args) {
        ThreadInstance threadInstance = new ThreadInstance();
        new Thread(threadInstance).start();
        new Thread(threadInstance).start();
        new Thread(threadInstance).start();
        new Thread(threadInstance).start();
        new Thread(threadInstance).start();


        ThreadLockInstance threadLockInstance = new ThreadLockInstance();
        new Thread(threadLockInstance,"thread1").start();
        threadLockInstance.lock();
        threadLockInstance.start();
        new Thread(threadLockInstance,"thread2").start();
        threadLockInstance.lock();
        threadLockInstance.start();
        new Thread(threadLockInstance,"thread3").start();
        threadLockInstance.lock();
        threadLockInstance.start();
        new Thread(threadLockInstance,"thread4").start();
        threadLockInstance.lock();
        threadLockInstance.start();
        new Thread(threadLockInstance,"thread5").start();
        threadLockInstance.lock();
        threadLockInstance.start();

    }
}
