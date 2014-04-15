package com.queue.sample.blockingq.producer;

import java.util.concurrent.BlockingQueue;

/**
 * @author: Syed Shahul
 */
public class BQProducer implements Runnable {
	BlockingQueue blockingQueue = null;

	public BQProducer(BlockingQueue blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			Integer i;
			Long s;
			Long start =0L;
			Long end =0L;
			start = System.currentTimeMillis();
			for (i = 0; i < 5000; i++) {
				s = System.currentTimeMillis();
				blockingQueue.put(s.toString().concat("_").concat(i.toString()));
				Thread.sleep(10);
			}
			end = System.currentTimeMillis();
			System.out.println("BQProducer time to put to blocking queue "+(end -
					start));
		} catch (InterruptedException e) {
			System.out.println("BQProducer : " + e.getMessage());
		}
	}
}
