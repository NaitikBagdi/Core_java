package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class demonstrates adding string values to a list and printing them using an iterator.
 *
 * @author Naitik
 */
public class StringList {

	public static void main(String[] args) {

		// Create a list to store a string value
		List<String> stringList = new ArrayList<String>();
		stringList.add("Pratapgarh");
		stringList.add("Ahmedabad");
		stringList.add("Jaipur");
		System.out.println("Before add element:" + stringList);

		 // Add new element in list
		stringList.add("Indore");

		// Print all values in the list using an iterator
		Iterator<String> stringItr = stringList.iterator();
		while (stringItr.hasNext()) {
			System.out.println(stringItr.next());
		}
	}

}
