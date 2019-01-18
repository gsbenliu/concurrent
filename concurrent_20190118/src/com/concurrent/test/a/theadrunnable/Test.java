package com.concurrent.test.a.theadrunnable;

/**
 * @Author: gang.liu
 * @Date: 2019/1/17 11:13
 */
public class Test {

    public static void main(String[] args) {

        RunnableInstance target = new RunnableInstance();

        new Thread(target).start();
        new Thread(target).start();
        new Thread(target).start();
        new Thread(target).start();

        ThreadInstance threadInstance = new ThreadInstance("mythread");
        threadInstance.run();
        threadInstance.start();
        threadInstance.start();

    }
}
