package corejava.com;

/**
 * The program to calculate 'EMI' using class, object, variables, operators, and datatypes.
 *
 * @author Naitik
 */
public class EmiCalculate {

	public static void main(String[] args) {
		EmiCalculate EmiCalculate = new EmiCalculate();
		System.out.println(EmiCalculate.EmiCalculate(2000, 20, 2));
	}

	/**
	 * This method is use to calculate monthly EMI.
	 * Math pow method us to find power of value.
	 * 
	 * @param amount A double amount representing a quality of principal of amount.
	 * @param rate A double rate representing a quality of rate.
	 * @param time A int time representing a year of value.
	 * @return double The calculate emi.
	 */
	public double EmiCalculate(double amount, double rate, int time) {
		rate = rate / (12 * 100);
		time = time * 12;
		double emi = (amount * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
		return emi;
	}

}
