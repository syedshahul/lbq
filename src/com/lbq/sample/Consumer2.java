package com.lbq.sample;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class Consumer2 implements Runnable {
	LinkedBlockingQueue linkedBlockingQueue = null;

	public Consumer2(LinkedBlockingQueue linkedBlockingQueue) {
		this.linkedBlockingQueue = linkedBlockingQueue;
	}

	@Override public void run() {
		try {

			while (true){
				System.out.println("Consumer2  "+linkedBlockingQueue.take());
			}

		} catch(InterruptedException e) {
			System.out.println(e.fillInStackTrace());
		}
	}
}
