package com.concurrent.test.h.threadinterrupt;

public class ThreadInstance extends Thread {
    public ThreadInstance(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("thread is interrupted");
                return;
            } else {
                System.out.println("thread is running");
            }
        }
    }
}