package oopsconcept.inheritance.single;

/**
 * This program demonstrate single inheritance.
 * It calls the parent class method with the help of child class object.
 * 
 * @author Naitik
 */
public class EmployeeInfo {

	public static void main(String[] args) {
		Branch branch = new Branch(101, "Naitik", "Trainee java developer");
		branch.employeeDetails();
		branch.branchDetails();
	}

}

/**
 * The employee class sets the employeeId and employeeName using a constructor.
 * It represents the details of an employee.
 */
class Employee {

	private int employeeId;
	private String employeeName;

	/**
	 * Constructor for creating employee object.
	 * 
	 * @param employeeId The id of the employee.
	 * @param employeeName The name of the employee.
	 */
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	/**
	 * This method prints the emplyee details.
	 * It include the employee id and employee name.
	 */
	public void employeeDetails() {
		System.out.println("Employee id: " + employeeId);
		System.out.println("Employee name: " + employeeName);
	}

}

/**
 * The Branch class represents the branch where an employee belongs.
 * It extends the Employee class to inherit its properties and methods.
 */
class Branch extends Employee {

	private String branchName;

	/**
	 * Constructor for creating a branch object. Initializes the employee ID, name,and branch name.
	 * Calls the constructor of the parent class employee using super keyword.
	 * 
	 * @param empId The id of employee.
	 * @param empName The name of employee.
	 * @param branchName The branch of employee branch.
	 */
	public Branch(int employeeId, String employeeName, String branchName) {
		super(employeeId, employeeName);
		this.branchName = branchName;
	}

	/**
	 * This method display branch detials.
	 * Print the branch name.
	 */
	public void branchDetails() {
		System.out.print("Branch name: " + branchName);
	}

}
