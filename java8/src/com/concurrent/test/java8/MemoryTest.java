package com.concurrent.test.java8;

import com.javamex.classmexer.MemoryUtil;

/**
 * @Author: gang.liu
 * @Date: 2019/1/30 16:01
 */
public class MemoryTest {


    static class BasicObject {
        int a;
        long b;
        static int c;
    }

    static class ArrayObject {
        long[] longs = new long[6];
    }


    public static void main(String[] args) {
        BasicObject basicObject = new BasicObject();
        // 打印对象的shallow size
        System.out.println("BasicObject Shallow Size: " + MemoryUtil.memoryUsageOf(basicObject) + " bytes");
        // 打印对象的 retained size
        System.out.println("BasicObject Retained Size: " + MemoryUtil.deepMemoryUsageOf(basicObject) + " bytes");


        ArrayObject arrayObject = new ArrayObject();
        // 打印对象的shallow size
        System.out.println("ArrayObject Shallow Size: " + MemoryUtil.memoryUsageOf(arrayObject) + " bytes");
        // 打印对象的 retained size
        System.out.println("ArrayObject Retained Size: " + MemoryUtil.deepMemoryUsageOf(arrayObject) + " bytes");

        /**
         * 启用指针压缩:-XX:+UseCompressedOops，禁止指针压缩:-XX:-UseCompressedOops
         * 基本类型
         *      Mark Word：             8 byte
         *      Class Pointer: 不压缩： 8 byte   压缩：4 byte
         *      instance data:         4 byte  +  8 byte
         *      padding:               4 byte     0 byte
         *                  8+8+12+4 = 32 byte    8+4+12=24 byte
         *
         * 数组
         *     Mark Word：              8 byte
         *     Class Pointer:  不压缩：  8 byte      压缩：4 byte
         *     Length：                 4 byte
         *     array data:              6*8 byte    6*8 byte
         *     padding:                 4
         *
         *              Retained Size=当前对象大小+当前对象可直接或间接引用到的对象的大小总和。
         *
         *              Shallow  8+8+4+4 = 24byte   Shallow  8+4+4+4 = 20byte
         *              array    8+8+4+6*8+4=72byte array    8+4+4+6*8+4=68byte
         *              Retained  24+72=96byte      Retained 20+68=88byte
         */


        String name =  new String("Xiaoming");
        System.out.println(name.toCharArray().length);
    }
}
