package com.lbq.sample;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class LBQConsumer {
	public static void main(String[] args) throws InterruptedException{
		LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1024);
		Producer producer = new Producer(linkedBlockingQueue);
		Consumer consumer = new Consumer(linkedBlockingQueue);

		new Thread(producer).start();
		new Thread(consumer).start();

		Thread.sleep(4000);
	}
}
