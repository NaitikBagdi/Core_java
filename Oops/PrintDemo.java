package oopsconcept.polymorphism.compiletime;

/**
 * This class explain a compile-time polymorphism.
 * It print multiple type of value.
 * 
 * @author Naitik
 */
public class PrintDemo {

	public static void main(String[] args) {
		Printer printUtility = new Printer();
		printUtility.print('N'); // Print character value
		printUtility.print(5.6f); // Print floating point number
		printUtility.print(100); // Print integer value
		printUtility.print("Naitik"); // Print string value
	}

}

class Printer {

	// Method to print a character
	public void print(char character) {
		System.out.println("Printing character:" + character);
	}

	// Method to print a floating point number
	public void print(float number) {
		System.out.println("Printing float number:" + number);
	}

	// Method to print an integer
	public void print(int number) {
		System.out.println("Printing number:" + number);
	}

	// Method to print a string
	public void print(String message) {
		System.out.println("Printing message:" + message);
	}

}
