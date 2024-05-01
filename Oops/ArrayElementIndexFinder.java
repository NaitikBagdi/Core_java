package collection;

/**
 * The program find the element index which given by user.
 * It iterates through the array and checks if the element exists.
 * If the element is found, it prints its index.
 * If not found, it prints a message indicating that the value does not exist in the given list.
 *
 * @author Naitik
 */
public class ArrayElementIndexFinder {

	public static void main(String[] args) {
		int[] arrayList = { 11, 22, 33, 44, 55, 66 };
		int findList = 33;
		boolean result = false;

		/**
		 * For loop iterates over the array list.
		 * It checks if the element exists or not, if it exists then return true.
		 */
		for (int startPoint = 0; startPoint < arrayList.length; startPoint++) {
			if (arrayList[startPoint] == findList) {
				System.out.println(findList + " is index of " + startPoint);
				result = true;
			}
		}

		// If result is still false, the target element was not found in the list.
		if (!result) {
			System.out.println("Value is not exist in list ");
		}
	}

}
