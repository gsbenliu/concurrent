package com.concurrent.juc.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 20:16
 */
public class AtomicIntegerTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1000);

        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.decrementAndGet());
        System.out.println(atomicInteger.getAndDecrement());
        System.out.println(atomicInteger.incrementAndGet());
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.addAndGet(10));
        System.out.println(atomicInteger.getAndAdd(10));
        System.out.println(atomicInteger.compareAndSet(20,10));
        System.out.println(atomicInteger.getAndSet(50));
        atomicInteger.lazySet(100);
        System.out.println(atomicInteger.get());
    }
}
