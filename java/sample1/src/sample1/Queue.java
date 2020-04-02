/**
 * 
 */
package sample1;

import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yzhang44
 *
 */
class Queue {
	private final Semaphore semaphore;
	private final Lock lock;
	private boolean freeWorkers[];

	public Queue() {
		semaphore = new Semaphore(1);
		freeWorkers = new boolean[1];
		Arrays.fill(freeWorkers, true);
		lock = new ReentrantLock();
	}

	public void dequeue() {
		try {
			semaphore.acquire();

			int worker = getWorker();

			Long duration = (long) (Math.random() * 10000);
			System.out.println(Thread.currentThread().getName() + " : reading "
			+ (duration / 1000) 
			+ " seconds" 
			);
			
			Thread.sleep(duration);

			releaseWorker(worker);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// Increase the semaphore counter back
			semaphore.release();
		}
	}

	private int getWorker() {
		int currentWorker = -1;
		try {
			// Get a lock here so that only one thread can go beyond this at a time
			lock.lock();

			for (int i = 0; i < freeWorkers.length; i++) {
				if (freeWorkers[i]) {
					currentWorker = i;
					freeWorkers[i] = false;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return currentWorker;
	}

	private void releaseWorker(int i) {
		lock.lock();
		freeWorkers[i] = true;
		lock.unlock();
	}
}