package com.lbq.sample;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class LBQConsumer {
	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10000);
		Producer producer = new Producer(linkedBlockingQueue);
		Consumer consumer = new Consumer(linkedBlockingQueue);
		Consumer1 consumer1 = new Consumer1(linkedBlockingQueue);
		Consumer2 consumer2 = new Consumer2(linkedBlockingQueue);

		new Thread(producer).start();
		new Thread(consumer).start();
		new Thread(consumer1).start();
		new Thread(consumer2).start();

		Thread.sleep(500);
	}
}
