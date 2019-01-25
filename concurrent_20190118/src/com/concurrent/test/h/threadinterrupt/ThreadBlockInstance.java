package com.concurrent.test.h.threadinterrupt;

public class ThreadBlockInstance extends Thread {
    public ThreadBlockInstance(String name) {
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
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }
}