package com.queue.sample.blockingq.consumer;

import java.util.concurrent.BlockingQueue;


/**
 * @author: Syed Shahul
 */
public class BQConsumer3 implements Runnable {
	BlockingQueue blockingQueue = null;

	public BQConsumer3(BlockingQueue blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			Integer i;

			while (true) {
				System.out.println("BQConsumer3  " + blockingQueue.take());
				// assuming some process
				Thread.sleep(1000);
			}

			/*System.out.println("blockingQueue : "+blockingQueue.toString());
			while (blockingQueue1.hasNext()) {
				blockingQueue  blockingQueue2 =blockingQueue1.next();
			System.out.println(blockingQueue2.take());
			}*/
		} catch (InterruptedException e) {
			System.out.println(e.fillInStackTrace());
		}
	}
}
