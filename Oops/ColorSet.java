package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * The program demonstrates the working of sets and inlclude multiple methods for manipulating sets.
 * It showcases operations such as union, intersection, and difference on sets or integers,
 * as well as adding elements to and copying elements between sets of strings.
 * 
 * @author Naitik
 */
public class ColorSet {

	public static void main(String[] args) {
		Integer[] naturalNumber = { 1, 2, 3, 4, 55, 87 };
		Integer[] number = { 10, 2, 55, 7, 99, 3, 75 };

		Set<Integer> naturalNumberSet = new HashSet<Integer>();
		naturalNumberSet.addAll(Arrays.asList(naturalNumber)); // Add all element to the set
		Set<Integer> numberSet = new HashSet<Integer>();
		numberSet.addAll(Arrays.asList(number));

		/**
		 * Combines the elements of two sets to create a union set.
		 * Print the all union elements.
		 */
		Set<Integer> unionData = new HashSet<Integer>(naturalNumberSet);
		unionData.addAll(numberSet);
		System.out.print("Union of natural number and number set is: ");
		System.out.println(unionData);

		/**
		 * Finds the intersection of two sets, the common elements between them.
		 * Compare two sets of element and find the common elements.
		 */
		Set<Integer> insertionData = new HashSet<Integer>(naturalNumberSet);
		insertionData.retainAll(numberSet);
		System.out.print("Insertion of natural number and number set is: ");
		System.out.println(insertionData);

		/**
		 * Finds the difference between two sets, elements present in the first set but not in the second set.
		 * Print the all difference elements those find.
		 * The removeAll method removes those elements that are common to both sets.
		 */
		Set<Integer> differenceData = new HashSet<Integer>(naturalNumberSet);
		differenceData.removeAll(numberSet);
		System.out.print("Difference of natural number and number set is: ");
		System.out.println(differenceData);

		/**
		 * This set collection of multiple colors.
		 * Adding new element for useing add method.
		 */
		Set<String> colorSet = new HashSet<String>();
		colorSet.add("Red");
		colorSet.add("Blue");
		colorSet.add("Orange");

		/**
		 * This set copies the set into the difference set.
		 * Additionally, it adds the new element.
		 */
		Set<String> colorOfSet = new HashSet<String>(colorSet);
		System.out.println("Color of set: " + colorOfSet);
		colorOfSet.add("Green");
		System.out.println("After adding new elelment color of set is: " + colorOfSet);
	}

}
