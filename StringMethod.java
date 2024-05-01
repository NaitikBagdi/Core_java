package corejava.com;

/**
 * The program to check string method.
 * It discrible multiple type of method thay a string may contain.
 * 
 * @author Naitik
 */
public class StringMethod {

	public static void main(String[] args) {
		String studentName = "Naitik";
		String userName = "Bagdi";
		System.out.println("Length of studentName is:" + studentName.length()); // Returns the index (the position) of the first occurrence of a specified text in a studentName.
		System.out.println("Upper case:" + studentName.toUpperCase()); // Convert upperCase.
		System.out.println("Lower case:" + studentName.toLowerCase()); // Convert lowerCase.
		System.out.println("Index of:" + studentName.indexOf('i')); // Return index of the specific text in studentName.
		System.out.println("Concate to studentName:" + studentName.concat(userName)); // Concact to string.
		System.out.println("Replace value:" + studentName.replace('i', 'a')); // Replace specific value.
		System.out.println("Replace all:" + studentName.replaceAll(userName , " Laxkar ")); // Replace all replace string value with different
		System.out.println("Code pint at:" + studentName.codePointAt(1)); // Returns the unicode value of the character.
		System.out.println("Contains:" + studentName.contains("k")); // The contains method checks whether a string contains a sequence of characters.
		System.out.println("toString method:" + studentName.toString()); // The toString() method returns the string itself.
		System.out.println("Is empty:"  + studentName.isEmpty()); // The isEmpty() method checks whether a string is empty or not.
		System.out.println("Join method:" + userName.join(" ", studentName, userName, "Laxkar")); // The join() method joins one or more strings with a specified separator.
	}

}
