package com.lbq.sample;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: Syed Shahul
 */
public class Consumer implements Runnable {
	LinkedBlockingQueue linkedBlockingQueue = null;

	public Consumer(LinkedBlockingQueue linkedBlockingQueue) {
		this.linkedBlockingQueue = linkedBlockingQueue;
	}

	@Override public void run() {
		try {
			Integer i;

			while (true){
				System.out.println("Consumer  "+linkedBlockingQueue.take());
			}

			/*System.out.println("linkedBlockingQueue : "+linkedBlockingQueue.toString());
			while (linkedBlockingQueue1.hasNext()) {
				LinkedBlockingQueue  linkedBlockingQueue2 =linkedBlockingQueue1.next();
			System.out.println(linkedBlockingQueue2.take());
			}*/
		} catch(InterruptedException e) {
			System.out.println(e.fillInStackTrace());
		}
	}
}
