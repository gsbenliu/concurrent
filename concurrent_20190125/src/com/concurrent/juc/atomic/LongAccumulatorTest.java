package com.concurrent.juc.atomic;

import java.util.concurrent.atomic.LongAccumulator;
import java.util.function.LongBinaryOperator;

/**
 * @Author: gang.liu
 * @Date: 2019/1/24 9:10
 */
public class LongAccumulatorTest {
    public static void main(String[] args) {
        LongAccumulator longAccumulator = new LongAccumulator(new LongBinaryOperator() {
            @Override
            public long applyAsLong(long left, long right) {
                System.out.println("left = " + left + ";right=" + right);
                return left + right;
            }
        }, 5);


        for (int i = 1; i < 10; i++) {
            final int a = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    longAccumulator.accumulate(a);
                    System.out.println(longAccumulator.get());
                }
            }).start();
        }
    }
}
