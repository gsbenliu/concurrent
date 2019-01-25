package com.concurrent.test.g.threadjoin;

/**
 * @Author: gang.liu
 * @Date: 2019/1/18 15:14
 */
public class Test {

    public static void main(String[] args) {

        ThreadInstance threadInstance1 = new ThreadInstance(" Thread1  ", 10000);
        ThreadInstance threadInstance2 = new ThreadInstance(" Thread2  ", 15000);
        ThreadInstance threadInstance3 = new ThreadInstance(" Thread3  ", 20000);
        ThreadInstance threadInstance4 = new ThreadInstance(" Thread4  ", 25000);
        ThreadInstance threadInstance5 = new ThreadInstance(" Thread5  ", 30000);

        threadInstance1.start();
        threadInstance2.start();
        threadInstance3.start();
        threadInstance4.start();
        threadInstance5.start();


        try {
            threadInstance1.join();
            threadInstance2.join();
            threadInstance3.join();
            threadInstance4.join();
            threadInstance5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程执行完毕");
    }
}
