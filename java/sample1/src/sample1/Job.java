/**
 * 
 */
package sample1;

/**
 * @author yzhang44
 *
 */
public class Job implements Runnable {

	private Queue queue;

	public Job(Queue q) {
		this.queue = q;
	}

	@Override
	public void run() {
		System.out.printf("%s: has been enqueued\n", Thread.currentThread().getName());
		queue.dequeue();
	}

}
