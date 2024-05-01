package oopsconcept.inheritance.hybrid;

/**
 * The program demonstrate hybrid inheritance, which is combination of two inheritance multilevel and hierarchical.
 * The main class representing the company's organizational structure.
 * It models the organizational structure of a company, with employees, managers, team leads, and senior managers.
 * 
 * @author Naitik
 */
public class CompanyStructure {

	public static void main(String[] args) {
		SeniorManager seniorManager = new SeniorManager();
		seniorManager.employeeDetails();
		seniorManager.managerDetails();
		seniorManager.seniorManagerDetails();

		TeamLead teamLead = new TeamLead();
		teamLead.employeeDetails();
		teamLead.leadTeam();
	}

}

/**
 * This class represents an employee.
 * It contains the definition of the employee class.
 */
class Employee {

	public void employeeDetails() {
		System.out.println("Employee class");
	}

}

/**
 * This class represents a manager and extends from the employee class.
 * It prints the definition of a manager class.
 */
class Manager extends Employee {

	public void managerDetails() {
		System.out.println("Manager class.");
	}

}

/**
 * This class represents a teamLead and extends from the employee class.
 * It prints the definition of a teamLead class.
 */
class TeamLead extends Employee {

	public void leadTeam() {
		System.out.println("Team lead class.");
	}

}

/**
 * This class represents a senior manager and extends from the manager class.
 * It inherits properties from both the Manager and employee classes.
 * The manager class inherits all properties of the employee class.
 * This process is an example of multilevel inheritance.
 */
class SeniorManager extends Manager {

	public void seniorManagerDetails() {
		System.out.println("Senior manager class.");
	}

}
