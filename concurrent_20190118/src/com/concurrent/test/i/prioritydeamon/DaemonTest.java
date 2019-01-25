package com.concurrent.test.i.prioritydeamon;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 15:10
 */
public class DaemonTest {

    public static void main(String[] args) {
        DaemonThreadInstance daemonThreadInstance1 = new DaemonThreadInstance("daemonThread1");
        DaemonThreadInstance daemonThreadInstance2 = new DaemonThreadInstance("daemonThread2");

        daemonThreadInstance1.start();

        daemonThreadInstance2.setDaemon(true);
        daemonThreadInstance2.start();
    }
}
