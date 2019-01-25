package com.concurrent.juc.atomic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 17:18
 */
public class AtomicLongTest {

    public static void main(String[] args) {

        AtomicLong atomicLong = new AtomicLong(1000);

        System.out.println(atomicLong.get());
        System.out.println(atomicLong.decrementAndGet());
        System.out.println(atomicLong.getAndDecrement());
        System.out.println(atomicLong.incrementAndGet());
        System.out.println(atomicLong.getAndIncrement());
        System.out.println(atomicLong.addAndGet(10));
        System.out.println(atomicLong.getAndAdd(10));
        System.out.println(atomicLong.compareAndSet(20,10));
        System.out.println(atomicLong.getAndSet(50));
        atomicLong.lazySet(100);
        System.out.println(atomicLong.get());

    }
}
