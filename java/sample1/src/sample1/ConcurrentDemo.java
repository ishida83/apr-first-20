/**
 * 
 */
package sample1;

/**
 * @author yzhang44
 *
 */

public class ConcurrentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue();
		Thread thread[] = new Thread[10];
		
		for (int i = 0; i < 10; i++) {
			thread[i] = new Thread(new Job(queue), "Thread " + i);
		}
		for (int i = 0; i < 10; i++) {
			thread[i].start();
		}

	}

}
