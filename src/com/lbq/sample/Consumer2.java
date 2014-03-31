package com.lbq.sample;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class Consumer2 implements Runnable {
	ArrayBlockingQueue arrayBlockingQueue = null;

	public Consumer2(ArrayBlockingQueue arrayBlockingQueue) {
		this.arrayBlockingQueue = arrayBlockingQueue;
	}

	@Override public void run() {
		try {

			while (true){
				System.out.println("Consumer2  "+arrayBlockingQueue.take());
			}

		} catch(InterruptedException e) {
			System.out.println(e.fillInStackTrace());
		}
	}
}
