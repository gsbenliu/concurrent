package com.concurrent.test.k.productconsume;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 16:16
 */
public class Consumer {

    private Repository repository;

    public Consumer(Repository repository) {
        this.repository = repository;
    }

    public void consume(int size) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                repository.consume(size);
            }
        }).start();
    }
}
