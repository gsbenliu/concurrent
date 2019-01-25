package com.concurrent.test.k.productconsume;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 16:14
 */
public class Producer {

    private Repository repository;

    public Producer(Repository repository) {
        this.repository = repository;
    }

    public void product(int size) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                repository.product(size);
            }
        }).start();
    }
}
