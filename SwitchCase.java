package corejava.com;

import java.util.Scanner;

/**
 * This program demonstrate switch case statement use to print the month name according to a given number.
 * The user is prompted to enter a number representing a month 1 to 12, and program print name of the month.
 * If user input not in the range of 1 to 12, it display message asking the correct number between 1 to 12.
 * 
 * @author Naitik
 */
public class SwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month of number: ");
		int yearNumber = scanner.nextInt();
		switch ( yearNumber ) {
		case 1:
			System.out.print("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Please enter valid input");
		}
	}

}
