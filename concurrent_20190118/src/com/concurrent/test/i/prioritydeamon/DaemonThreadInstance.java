package com.concurrent.test.i.prioritydeamon;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 15:01
 */
public class DaemonThreadInstance extends Thread {

    public DaemonThreadInstance(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() +"(isDaemon="+this.isDaemon()+ ")" +", loop "+i);
            if (i == 2000) {
                return;
            }
        }
    }
}
