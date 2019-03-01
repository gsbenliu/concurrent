package com.concurrent.test.java8;

public class HSDBTest {
    public static void main(String[] args) throws InterruptedException {
        Obj o = new Obj(20, 175, false, "小明", "浙江杭洲", "男");
        Thread.sleep(1000 * 3600);
        System.out.println(o);
    }
}
