package com.concurrent.test.i.prioritydeamon;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 15:14
 */
public class TestPriority {

    public static void main(String[] args) {

        PriorityThreadInstance priorityThreadInstance1 = new PriorityThreadInstance("PriorityThread1");
        PriorityThreadInstance priorityThreadInstance2 = new PriorityThreadInstance("PriorityThread2");

        priorityThreadInstance1.setPriority(Thread.MIN_PRIORITY);
        priorityThreadInstance2.setPriority(Thread.MAX_PRIORITY);

        priorityThreadInstance1.start();
        priorityThreadInstance2.start();
    }
}
