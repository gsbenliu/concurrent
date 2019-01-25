package com.concurrent.test.e.threadyield;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 15:14
 */
public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        ThreadInstance threadInstance1 = new ThreadInstance("THREAD1", test);
        ThreadInstance threadInstance2 = new ThreadInstance("THREAD2", test);
        ThreadInstance threadInstance3 = new ThreadInstance("THREAD3", test);
        ThreadInstance threadInstance4 = new ThreadInstance("THREAD4", test);
        ThreadInstance threadInstance5 = new ThreadInstance("THREAD5", test);
        ThreadInstance threadInstance6 = new ThreadInstance("THREAD6", test);
        threadInstance1.start();
        threadInstance2.start();
        threadInstance3.start();
        threadInstance4.start();
        threadInstance5.start();
        threadInstance6.start();
    }
}
