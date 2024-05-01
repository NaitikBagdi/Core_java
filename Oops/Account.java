package oopsconcept.encapsulation;

/**
 * The account class demonstrate encapsulation.
 * The acccount class manages bank account information.
 * It demonstrates how to create an account, set account details, and retrieve account details.
 * 
 *  @author Naitik
 */
public class Account {

	public static void main(String[] args) {
		CreateAccount createAccount = new CreateAccount();
		createAccount.setAccountNumber(12345678945l);
		createAccount.setName("Naitik Bagdi");
		createAccount.setAmount(50000);

		System.out.println("Account number:" + createAccount.getAccountNumber());
		System.out.println("Account holder name:" + createAccount.getName());
		System.out.println("Amount:"+ createAccount.getAmount());
	}

}

/**
 * The CreateAccount class represents a bank account.
 * It contains methods to set and retrieve account details.
 */
class CreateAccount {

	private long accountNumber;
	private String name;
	private float amount;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
