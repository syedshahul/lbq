package com.lbq.sample;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class Consumer implements Runnable{
	LinkedBlockingQueue linkedBlockingQueue =null;

	public Consumer(LinkedBlockingQueue linkedBlockingQueue) {
		this.linkedBlockingQueue = linkedBlockingQueue;
	}

	@Override public void run() {
		try {
			System.out.println(linkedBlockingQueue.take());
			System.out.println(linkedBlockingQueue.take());
			System.out.println(linkedBlockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
