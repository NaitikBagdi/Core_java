package corejava.com;

import java.util.Scanner;

/**
 * The program is demonstrate if else statement.
 * 
 * @author Naitik
 */
public class IfElseStatement {

	/**
	 * The class demonstrate three static variable whose value are initialized at compile time.
	 * It contains three variable: child age, teenager and younger age to represt age of group.
	 */
	class Constants {
		static final int CHILD_AGE = 15;
		static final int TEENAGER = 20;
		static final int YOUNG_AGE = 60;
	}

	/**
	 * This program work according to the user input. It dynamically check age through the user input.
	 * Access the final variable directly without creating an object of its class.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age:");
		int userInput = scanner.nextInt();
		if (userInput < Constants.CHILD_AGE) {
			System.out.println("You are children");
		} else if (userInput >= Constants.CHILD_AGE && userInput < Constants.TEENAGER) {
			System.out.println("You are teenager");
		} else if (userInput >= Constants.TEENAGER && userInput < Constants.YOUNG_AGE) {
			System.out.println("You are younger");
		} else {
			System.out.println("You are senior citizen");
		}
	}

}
