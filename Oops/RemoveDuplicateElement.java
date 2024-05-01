package collection;

import java.util.LinkedList;
import java.util.List;

/**
 * The program remove the duplicate element in the list.
 * 
 * @author Naitik
 */
public class RemoveDuplicateElement {

	public static void main(String[] args) {
		List<String> stringList = new LinkedList<String>();
		stringList.add("A");
		stringList.add("A");
		stringList.add("A");
		stringList.add("B");
		stringList.add("C");
		stringList.add("D");
		stringList.add("D");
		stringList.add("D");
		stringList.add("A");
		stringList.add("C");
		stringList.add("E");
		stringList.add("E");
		stringList.add("E");

		System.out.println(stringList);

		// To remove duplicate elements from a list, you can use a set, which automatically removes duplicates.
		Set<String> unicList = new HashSet<String>(stringList);
		System.out.println(unicList);
	}

}
