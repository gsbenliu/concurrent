package com.concurrent.test.k.productconsume;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 15:16
 */
public class Repository {

    /**
     * 仓库容量
     */
    private volatile int capacity;

    private volatile int stock;

    public Repository(int capacity) {
        this.capacity = capacity;
        stock = 0;
    }

    /**
     * 生产数量
     *
     * @param size
     */
    public synchronized void product(int size) {
        try {
            if (stock >= capacity) {
                wait();
            }
            while (stock < capacity) {
                size--;
                if (size == 0) {
                    return;
                }
                stock++;
                System.out.printf("produce --> capacity=%3d, stock=%3d\n", capacity, stock);
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume(int size) {
        while (stock >= 0) {
            if (stock <= 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            size--;
            if (size == 0) {
                return;
            }
            stock--;
            System.out.printf("consume --> capacity=%3d, stock=%3d\n", capacity, stock);
            notifyAll();
        }
    }

}
