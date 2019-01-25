package com.concurrent.test.i.prioritydeamon;

import com.concurrent.test.g.threadjoin.ThreadInstance;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 15:01
 */
public class PriorityThreadInstance extends Thread {

    public PriorityThreadInstance(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println(Thread.currentThread().getName() + "(" + Thread.currentThread().getPriority() + ")" + ", loop " + i);
            if (i == 2000) {
                return;
            }
        }
    }
}
