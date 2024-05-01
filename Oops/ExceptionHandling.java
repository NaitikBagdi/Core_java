package oopsconcept.exception;

/**
 * The exception handling program demonstrate the working of try,catch ,finally
 * ,throw and throws keywords.
 * 
 * @author Naitik
 */
public class ExceptionHandling {

	/**
	 * It demonstrates exception handling by calling the testing method of exception handling class.
	 * It execute the final block regardless of whether an exception occurred or not.
	 */
	public static void main(String[] args) {
		ExceptionHandling exceptionHanding = new ExceptionHandling();
		try {
			exceptionHanding.performSafeDivision();
		} catch (ArithmeticException e) {
			System.out.println("Exception occurred: " + e);
		} finally {
			System.out.println("Given program is exception handling.");
		}
	}

	/**
	 * This method performs a division operation to test for exceptions.
	 * It divides two integers and throws an arithmetic exception if the second number is zero.
	 * 
	 * @throws ArithmeticException If the second number is zero.
	 */
	public void performSafeDivision() throws ArithmeticException {
		int firstNumber = 10;
		int secondNumber = 0;
		if (secondNumber == 0) {
			throw new ArithmeticException("AirthmeticException ");
		}
		System.out.println(firstNumber / secondNumber);
	}

}
