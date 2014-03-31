package com.lbq.sample;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class Producer implements Runnable {
	LinkedBlockingQueue linkedBlockingQueue = null;

	public Producer(LinkedBlockingQueue linkedBlockingQueue) {
		this.linkedBlockingQueue = linkedBlockingQueue;
	}

	@Override public void run() {
		try {
			Integer i;
			Long s;
			for(i = 0; i < 5000; i++) {
				s = System.currentTimeMillis();
				linkedBlockingQueue.put(s.toString().concat("_").concat(i.toString()));
				Thread.sleep(100);
			}

		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
