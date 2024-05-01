package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * This program describe comparable and comparator.
 * 
 * @author Naitik
 */
public class ComparableAndComparator {

	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(101, "Naitik", 8568658956l));
		employeeList.add(new Employee(102, "Jayesh", 7564896452l));
		employeeList.add(new Employee(105, "Dhiraj", 7865434567l));
		employeeList.add(new Employee(103, "Vishal", 6589946554l));

		System.out.println("Sorting by comparable:");
		System.out.println("Before sorting:" + employeeList);
		Collections.sort(employeeList); // Sort by comparable
		System.out.println("After sorting:" + employeeList);

		System.out.println("Sorting by comparator:");
		System.out.println("Before sorting:" + employeeList);
		Collections.sort(employeeList, new Employees()); // Sort by comparator
		System.out.println("After sorting:" + employeeList);
	}

}

/**
 * This class for demonstrate comparable interface for sorting purpose.
 * The employee class implement comparable interface.
 */
class Employee implements Comparable<Employee> {

	private int employeId;
	private String employeeName;
	private long phoneNumber;

	/**
	 * Compares this employee object with another employee object based on their employeeId.
	 * This method is required to implement the comparable interface.
	 *
	 * @param compareObject The employee object to compare with.
	 * @return A negative integer, zero, or a positive integer if this object is less than, equal to,
	 * or greater than the specified object based on their employeeId.
	 */
	@Override
	public int compareTo(Employee compareObject) {
		return this.employeId - compareObject.employeId;
	}

	/**
	 * Constructor for employee, initialize employeeId, employeeName, phoneNumber.
	 * Initialize employeeId, employeeName, phoneNumber.
	 * 
	 * @param employeeId The unique identifier of the employee.
	 * @param employeeName The name of the employee. 
	 * @param phoneNumber The number of the employee.
	 */
	public Employee(int employeeId, String employeeName, long phoneNumber) {
		this.employeId = employeeId;
		this.employeeName = employeeName;
		this.phoneNumber = phoneNumber;
	}

	public int getEmployeId() {
		return employeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * This method overrides the default toString() method of the object class.
	 * Override to string method for print the list of element.
	 */
	@Override
	public String toString() {
		return "Employee [employeId=" + employeId + ", employeeName=" + employeeName + ", phoneNumber=" + phoneNumber"]";
	}

}

/**
 * This class for demonstrate comparator interface for sorting two different object based on there employeeId.
 * The employee class implement comparator interface.
 */
class Employees implements Comparator<Employee> {

	/**
	 * This method overrides the compare() method of the comparator interface.
	 * It compares two employee objects based on their employee IDs.
	 * 
	 * @param employeeAlpha The first employee object to compare.
	 * @param employeeBeta The second employee object to compare.
	 */
	@Override
	public int compare(Employee employeeAlpha, Employee employeeBeta) {
		return employeeAlpha.getEmployeId() - employeeBeta.getEmployeId();
	}

}
