package com.queue.sample.blockingq;

import com.queue.sample.blockingq.consumer.BQConsumer;
import com.queue.sample.blockingq.consumer.BQConsumer1;
import com.queue.sample.blockingq.producer.BQProducer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author  Syed Shahul
 * @<title>LinkedBlockingQueue</title>
 * @see : http://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
 */
public class LBQSetup {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue blockingQueue = new LinkedBlockingQueue(10000);
		BQProducer bqProducer = new BQProducer(blockingQueue);
		BQConsumer bqConsumer = new BQConsumer(blockingQueue);
		BQConsumer1 bqConsumer1 = new BQConsumer1(blockingQueue);

		new Thread(bqProducer).start();
		new Thread(bqConsumer).start();
		new Thread(bqConsumer1).start();

		Thread.sleep(10);
	}
}
