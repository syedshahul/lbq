package com.lbq.sample;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class Consumer implements Runnable {
	ArrayBlockingQueue arrayBlockingQueue = null;

	public Consumer(ArrayBlockingQueue arrayBlockingQueue) {
		this.arrayBlockingQueue = arrayBlockingQueue;
	}

	@Override public void run() {
		try {
			Integer i;

			while (true){
				System.out.println("Consumer  "+arrayBlockingQueue.take());
			}

			/*System.out.println("ArrayBlockingQueue : "+ArrayBlockingQueue.toString());
			while (ArrayBlockingQueue1.hasNext()) {
				ArrayBlockingQueue  ArrayBlockingQueue2 =ArrayBlockingQueue1.next();
			System.out.println(ArrayBlockingQueue2.take());
			}*/
		} catch(InterruptedException e) {
			System.out.println(e.fillInStackTrace());
		}
	}
}
