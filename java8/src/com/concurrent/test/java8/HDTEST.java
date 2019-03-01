package com.concurrent.test.java8;

import com.sun.istack.internal.NotNull;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Author: gang.liu
 * @Date: 2019-02-11 13:48
 */
public class HDTEST {

    @NotNull
    @SuppressWarnings("ALL")
    public static final Unsafe UNSAFE;
    private static final int BYTES_OFFSET;

    // RandomDataInput
    static {
        try {
            @SuppressWarnings("ALL")
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            UNSAFE = (Unsafe) theUnsafe.get(null);
            BYTES_OFFSET = UNSAFE.arrayBaseOffset(byte[].class);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(UNSAFE);
        System.out.println(BYTES_OFFSET);
//        System.out.println(UNSAFE.getAddress(BYTES_OFFSET));
        System.out.println(UNSAFE.allocateMemory(1000));
        System.out.println(UNSAFE.pageSize());
        System.out.println(UNSAFE.reallocateMemory(1000, 2000));
        UNSAFE.freeMemory(1000);


    }
}
