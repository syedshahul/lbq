package com.queue.sample.blockingq;

import com.queue.sample.blockingq.consumer.BQConsumer;
import com.queue.sample.blockingq.consumer.BQConsumer1;
import com.queue.sample.blockingq.consumer.BQConsumer2;
import com.queue.sample.blockingq.consumer.BQConsumer3;
import com.queue.sample.blockingq.consumer.BQConsumer4;
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
		BQConsumer2 bqConsumer2 = new BQConsumer2(blockingQueue);
		BQConsumer3 bqConsumer3 = new BQConsumer3(blockingQueue);
		BQConsumer4 bqConsumer4 = new BQConsumer4(blockingQueue);

		Thread prdcr1 = new Thread(bqProducer);
		prdcr1.start();

		Thread c =new Thread(bqConsumer);
		c.start();

		Thread c1 =new Thread(bqConsumer1);
		c1.start();
		Thread c2 =new Thread(bqConsumer2);
		c2.start();

		Thread c3 =new Thread(bqConsumer3);
		c3.start();

		Thread c4 =new Thread(bqConsumer4);
		c4.start();

		Thread.sleep(10);
	}
}
