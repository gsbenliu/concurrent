package com.concurrent.juc.atomic;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 20:37
 */
public class UNsafeTest {

    public static void main(String[] args) {
        // 通过反射实例化Unsafe
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            Unsafe unsafe = (Unsafe) f.get(null);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
