package com.concurrent.test.k.productconsume;

/**
 * @Author: gang.liu
 * @Date: 2019/1/22 16:17
 */
public class RepositoryTest {

    public static void main(String[] args) {

        Repository repository = new Repository(500);
        Producer producer = new Producer(repository);
        Consumer consumer = new Consumer(repository);

        producer.product(10);
        producer.product(20);
        producer.product(30);
        producer.product(5);


        consumer.consume(10);
        consumer.consume(5);
        consumer.consume(5);
        consumer.consume(5);
        consumer.consume(5);


        producer.product(15);
        producer.product(10);
        producer.product(20);
        producer.product(30);
        producer.product(5);
        producer.product(15);


        consumer.consume(10);
        consumer.consume(5);
        consumer.consume(5);
        consumer.consume(5);
        consumer.consume(5);
    }
}
