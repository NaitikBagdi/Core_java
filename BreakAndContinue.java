package corejava.com;

/**
 * This program demonstrates the usage of the break and continue statements.
 * It contains two methods breakstatement and continue statement.
 * 
 * @author Naitik
 */
public class BreakAndContinue {

	private final int LIMIT = 10;

	public static void main(String[] args) {
		BreakAndContinue breakAndContinue = new BreakAndContinue();
		breakAndContinue.breakStatement();
		breakAndContinue.continueStatement();
	}

	/**
	 * Demonstrate the use of break statement.
	 * It iterate 1 to predefind limit, printing each value.
	 * When the start value is equal 5, the loop is terminate using break statemenet.
	 */
	public void breakStatement() {
		for (int start = 1; start <= LIMIT; start++) {
			System.out.println(start);
			if (start == 5) {
				break;
			}
		}
	}

	/**
	 * Demonstrate the use of continue statement.
	 * It iterate 1 to predefind limit, printing each value.
	 * When the start value is equal 5, the loop is skip and continue with next value.
	 */
	public void continueStatement() {
		for (int start = 1; start <= LIMIT; start++) {
			if (start == 5) {
				continue;
			}
			System.out.println(start);
		}
	}

}