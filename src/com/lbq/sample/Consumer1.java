package com.lbq.sample;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class Consumer1 implements Runnable {
	ArrayBlockingQueue arrayBlockingQueue = null;

	public Consumer1(ArrayBlockingQueue arrayBlockingQueue) {
		this.arrayBlockingQueue = arrayBlockingQueue;
	}

	@Override public void run() {
		try {

			while (true){
				System.out.println("Consumer1  "+arrayBlockingQueue.take());
			}

		} catch(InterruptedException e) {
			System.out.println(e.fillInStackTrace());
		}
	}
}
