/**
 * 
 */
package sample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yzhang44
 *
 */
public class CollectionDemo {

	public static <T> List<T> merge(List<T> list1, List<T> list2) {
		List<T> list = new ArrayList<>();

		list.addAll(list1);
		list.addAll(list2);

		return list;
	}

	/**
	 * @param <T>
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final List<Integer> first = Arrays.asList(1, 2, 3);
		final List<Integer> second = Arrays.asList(4, 5, 6);
		System.out.println(CollectionDemo.merge(first, second));
		
		final List<String> third = Arrays.asList("a", "b");
		final List<String> fourth = Arrays.asList("c", "d");
		System.out.println(CollectionDemo.merge(third, fourth));

	}

}
