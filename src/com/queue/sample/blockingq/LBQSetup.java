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
 * LinkedBlockingQueue
 * @see :http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html#java-blockingqueue-example
 * Java Best Practices – Queue battle and the Linked ConcurrentHashMap
 * @see : http://www.javacodegeeks.com/2010/09/java-best-practices-queue-battle-and.html
 * Producer and Consumer pattern
 * @see : http://javarevisited.blogspot.in/2012/02/producer-consumer-design-pattern-with.html
 *
 */
public class LBQSetup {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue blockingQueue = new LinkedBlockingQueue(10000);
		BQProducer bqProducer = new BQProducer(blockingQueue);
		BQConsumer bqConsumer = new BQConsumer(blockingQueue);
		BQConsumer1 bqConsumer1 = new BQConsumer1(blockingQueue);

		Thread prdcr1 = new Thread(bqProducer);
		prdcr1.start();

		Thread c1 =new Thread(bqConsumer);
		c1.start();

		Thread c2 =new Thread(bqConsumer1);
		c2.start();

		Thread.sleep(10);
	}
}
