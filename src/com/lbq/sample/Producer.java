package com.lbq.sample;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class Producer implements Runnable {
	ArrayBlockingQueue arrayBlockingQueue = null;

	public Producer(ArrayBlockingQueue arrayBlockingQueue) {
		this.arrayBlockingQueue = arrayBlockingQueue;
	}

	@Override public void run() {
		try {
			Integer i;
			Long s;
			for(i = 0; i < 5000; i++) {
				s = System.currentTimeMillis();
				arrayBlockingQueue.put(s.toString().concat("_").concat(i.toString()));
				Thread.sleep(100);
			}

		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
