package corejava.com;

/**
 * The program demonstrate while loop and do while loop.
 * The program to print 1 to 10 natural number of series.
 * The program inlcude two method while loop and do while loop.
 * 
 * @author Naitik
 */
public class WhileAndDoWhile {

	private final int LIMIT = 10;

	/**
	 * The while loop is used to execute the code unkonown number of times.
	 * It prints number from 1 to the given limit number of times.
	 */
	public void whileLoop() {
		int i = 1;
		while (i <= LIMIT) {
			System.out.println(i);
			i++;
		}
	}

	/**
	 * The do-while loop runs at least one time if the condition is false.
	 * It prints number from 1 to the given limit number of times.
	 */
	public void doWhileLoop() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= LIMIT);
	}

	public static void main(String[] args) {
		WhileAndDoWhile whileAndDoWhile = new WhileAndDoWhile();
		whileAndDoWhile.whileLoop();
		whileAndDoWhile.doWhileLoop();
	}

}