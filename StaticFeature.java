package corejava.com;

/**
 * The class demonstrate the static feature.
 * This program use static variable, method and static block.
 *
 * @author Naitik
 */
public class StaticFeature {

	public static int staticNumber = 5;

	/**
	 * The static block run only once when class is loaded in the memory.
	 * Displays the value of the static variable staticNumber.
	 * In static block change the value of static variable.
	 */
	static {
		System.out.println("Inside the static block");
		staticNumber = 10;
	}

	/**
	 * Print a message indicating that we are inside the static method.
	 * Displays the value of the static variable staticNumber.
	 */
	public static void staticMethod() {
		System.out.println("Inside the static method");
		System.out.println("Static variable:" + staticNumber);
	}

	public static void main(String[] args) {
		staticMethod();
	}

}
