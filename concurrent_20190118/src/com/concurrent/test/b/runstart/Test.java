package com.concurrent.test.b.runstart;

/**
 * @Author: gang.liu
 * @Date: 2019/1/17 14:00
 */
public class Test {

    public static void main(String[] args) {
        ThreadInstance threadInstance = new ThreadInstance("");

        threadInstance.start();
        threadInstance.run();
    }
}
