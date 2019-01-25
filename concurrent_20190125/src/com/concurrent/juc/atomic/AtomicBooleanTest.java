package com.concurrent.juc.atomic;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 20:16
 */
public class AtomicBooleanTest {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);

        System.out.println(atomicBoolean.compareAndSet(false, true));
        System.out.println(atomicBoolean.get());
        System.out.println(atomicBoolean.getAndSet(false));
        atomicBoolean.lazySet(false);
        atomicBoolean.set(false);
        System.out.println(atomicBoolean.weakCompareAndSet(true, false));
    }
}
