package com.concurrent.test.java8;

import java.util.function.LongBinaryOperator;

/**
 * @Author: gang.liu
 * @Date: 2019/1/29 14:49
 */
public class LongAccumulator {


    public static void main(String[] args) {


        java.util.concurrent.atomic.LongAccumulator longAccumulator =
                new java.util.concurrent.atomic.LongAccumulator(new LongBinaryOperator() {
                    @Override
                    public long applyAsLong(long left, long right) {
                        System.out.println("left = " + left + ";right=" + right);
                        return left + right;
                    }
                }, 1);


        System.out.println(longAccumulator.get());
    }
}
