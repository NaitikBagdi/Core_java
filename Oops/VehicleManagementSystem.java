package oopsconcept.inheritance.hierarchical;

/**
 * This is program demonstrate hierarchical inheritance.
 * 
 * @author Naitik
 */
public class VehicleManagementSystem {

	public static void main(String[] args) {
		Car car = new Car("Toyota", "Camry", 2020,"Gasoline", 4);
		Truck truck = new Truck("Ford", "F-150", 2024, 2.7, 2);

		System.out.println("Car information ");
		car.displayCarInformation();
		System.out.println();

		System.out.println("Truck information ");
		truck.displayTruckInformation();
	}

}

/**
 * The class represent a vehicle.
 * The include the mode, make and year of manufacture.
 */
class Vehicle {

	private String model; // Model of the vehicle
	private String make; // Make of the vehicle
	private int year; // Manufacture of the year

	/**
	 * Constructor for vehicle, initializes the model, make and year.
	 * 
	 * @param model The model of the vehicle.
	 * @param make The make of the vehicle.
	 * @param year The manufacture of the vehicle year.
	 */
	public Vehicle(String model, String make, int year) {
		this.model = model;
		this.make = make;
		this.year = year;
	}

	/**
	 * The display method print details of vehicle.
	 * It include the vehicle model, make and manufacture year.
	 */
	public void displayVehicleInformation() {
		System.out.println("Model name: " + model);
		System.out.println("Make: " + make);
		System.out.println("Manufacture year: " + year);
	}

}

/**
 * The class represent a car.
 * It is extends properties of a vehicle.
 */
class Car extends Vehicle {

	private String fuelType;
	private int numberOfDoors;

	/**
	 * Constructor for car, initializes the model, make, year fuel-type num doors.
	 * 
	 * @param model The model of the vehicle.
	 * @param make The make of the vehicle.
	 * @param year The year of the manufacture.
	 * @param fuelType The fuel type of the car.
	 * @param numDoors The number of doors 
	 */
	public Car(String model, String make, int year, String fuelType, int numberOfDoors) {
		super(model, make, year);
		this.fuelType = fuelType;
		this.numberOfDoors = numberOfDoors;
	}

	/**
	 * The display method print details of car.
	 * This method use super keyword for transfer the control in parent(Vehicle Class) for print the vehicle details.
	 */
	public void displayCarInformation() {
		super.displayVehicleInformation();
		System.out.println("Fuel type: " + fuelType);
		System.out.println("Number of doors: " + numberOfDoors);
	}

}

/**
 * The class represent a truck.
 * It extends the properties of a vehicle.
 */
class Truck extends Vehicle {

	private double maxPayload;
	private int numAxles;

	/**
	 * Constructor for truck, initializes the model, make, year, fuel-type num doors.
	 * 
	 * @param model The model of the vehicle.
	 * @param make The make of the vehicle.
	 * @param year The year of the manufacture.
	 * @param fuelType The fuel type of the car.
	 * @param numDoors The number of doors 
	 */
	public Truck(String made, String make, int year, double maxPayload, int numAxles) {
		super(made, make, year);
		this.maxPayload = maxPayload;
		this.numAxles = numAxles;
	}

	/**
	 * The display method print details of truck.
	 * This method use super keyword for transfer the control in parent(Vehicle class) for print vehicle details.
	 */
	public void displayTruckInformation() {
		super.displayVehicleInformation();
		System.out.println("Maximum payload: " + maxPayload);
		System.out.println("Number of axles: " + numAxles);
	}

}
