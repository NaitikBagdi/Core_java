package corejava.com;

import java.util.Scanner;

/**
 * This program demonstrate the example of the ‘for’ loop and print the pattern.
 * 
 * @author Naitik
 */
public class Pattern {

	/**
	 * The program is print star pattern.
	 * It prints patter according to the user input number of row.
	 * It defines two for loop the outer loop represents rows, and inner loop represent columns.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter row number: ");
		int rowNumber = scanner.nextInt();
		// Outer for loop.
		for (int row = 1; row <= rowNumber; row++) {
			// Inner for loop.
			for (int column = 1; column <= row; column++) {
				System.out.print("*" + " ");
			}
			// If the row and rowNumbe valriable are not equal then a new line print, other wise it will return false condition.
			if (row != rowNumber) {
				System.out.println();
			}
		}
	}

}
