package corejava.com;

/**
 * This program to compare two variable of the wrapper class using wrapper class.
 * It compares two object using the compareTo method.
 * In the if else condition, it check the given number is less then of greater then.
 * 
 * @author Naitik
 */
public class WrapperClasses {

	public static void main(String[] args) {
		Integer firstNumber = 1200;
		Integer secondNumber = 1300;
		if (firstNumber.compareTo(secondNumber) == 0) {
			System.out.println("Both value are equal ");
		} else if (firstNumber.compareTo(secondNumber) > 0) {
			System.out.println("First number is greater than second number ");
		} else {
			System.out.println("Second number is greater than first number ");
		}
	}

}