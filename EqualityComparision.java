package corejava.com;

import java.math.BigDecimal;

/**
 * This program evaluate the difference between .equals and == method.
 *
 * @author Naitik
 */
public class EqualityComparision {

	public static void main(String[] args) {
		EqualityComparison comparison = new EqualityComparison();
		comparison.stringComparison("Naitik", "Naitik");
		comparison.integerComparison(25, 25);
		comparison.bigDecimalComparison();
	}

	/**
	 * This method demonstrate two method .equals and ==.
	 * The method compare two string value using .equals and == operator.
	 * 
	 * @param firstName The first string to be compared.
	 * @param lastName The second string to be compared.
	 */
	public void stringComparison(String firstName, String lastName) {
		System.out.println("Two string comparison using .equls:" + firstName.equals(lastName));
		System.out.println("Two string comparison using ==:" + (firstName == lastName));
	}

	/**
	 * This method compare two integer value using .equals and == operator.
	 *
	 * @param age The first integer to be compared.
	 * @param id  The second integer to be compared.
	 */
	public void integerComparison(Integer age, Integer id) {
		System.out.println("Two integer comparison using .equls:" + age.equals(id));
		System.out.println("Two integer comparison using ==:" + (age == id));
	}

	/**
	 * This method compare two big decimal value using .equals and == operator.
	 * In the method create big decimal object using new keyword.
	 */
	public void bigDecimalComparison() {
		BigDecimal firstDecimal = new BigDecimal(10.55);
		BigDecimal secondDecimal = new BigDecimal(10.55);

		System.out.println("Two bigdecimal comparison using .equls:" + firstDecimal.equals(secondDecimal));
		System.out.println("Two bigdecimal comparison using ==:" + (firstDecimal == secondDecimal));
	}

}
