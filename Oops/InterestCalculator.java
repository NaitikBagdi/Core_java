package oopsconcept.polymorphism.runtime;

/**
 * The interest calculator class is describe runtime polymorphism.
 * 
 * @author Naitik
 */
public class InterestCalculator {

	public static void main(String[] args) {
		Bank bank;
		bank = new ICICI();
		System.out.println("ICICI bank rate of interest:" + bank.rateOfInterest());

		bank = new SBI();
		System.out.println("SBI bank rate of interest:" + bank.rateOfInterest());

		bank = new AXIS();
		System.out.println("AXIS bank rate of interest:" + bank.rateOfInterest());
	}

}

/**
 * The bank class represents a generic bank.
 * This method returns the rate of interest.
 */
class Bank {

	float rateOfInterest() {
		return 0;
	}

}

/**
 * The class represents icici band and defines the rate of interest.
 * It extends the bank class.
 */
class ICICI extends Bank {

	/**
	 * The overridden method finds the icici bank rate of interest.
	 * 
	 * @return the rate of interest.
	 */
	@Override
	float rateOfInterest() {
		return 5.6f;
	}

}

/**
 * This class represents sbi bank and defines the rate of interest.
 * It extends the bank class.
 */
class SBI extends Bank {

	/**
	 * The overridden method finds the sbi bank rate of interest.
	 * 
	 * @return the rate of interest.
	 */
	@Override
	float rateOfInterest() {
		return 6.9f;
	}

}

/**
 * The class represents axis bank and defines the rate of interest.
 * It extends the bank class.
 */
class AXIS  extends Bank {

	/**
	 * The overridden method find the axis bank rate of interest.
	 * 
	 * @return the rate of interest.
	 */
	@Override
	float rateOfInterest() {
		return 7.5f;
	}

}
