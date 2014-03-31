package com.lbq.sample;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class LBQConsumer {
	public static void main(String[] args) throws InterruptedException {
		ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10000);
		Producer producer = new Producer(arrayBlockingQueue);
		Consumer consumer = new Consumer(arrayBlockingQueue);
		Consumer1 consumer1 = new Consumer1(arrayBlockingQueue);
		Consumer2 consumer2 = new Consumer2(arrayBlockingQueue);

		new Thread(producer).start();
		new Thread(consumer).start();
		new Thread(consumer1).start();
		new Thread(consumer2).start();

		Thread.sleep(500);
	}
}
