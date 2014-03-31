package com.lbq.sample;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class Producer implements Runnable{
	LinkedBlockingQueue linkedBlockingQueue =null;

	public Producer(LinkedBlockingQueue linkedBlockingQueue) {
		this.linkedBlockingQueue = linkedBlockingQueue;
	}

	@Override public void run() {
		try {
			linkedBlockingQueue.put("1");
			Thread.sleep(1000);
			linkedBlockingQueue.put("2");
			Thread.sleep(1000);
			linkedBlockingQueue.put("3");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
