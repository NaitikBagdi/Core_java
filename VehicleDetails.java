package corejava.com;

/**
 * This program describe the this and super keyword.
 *
 * @author Naitik
 */
public class VehicleDetails {

	public static void main(String[] args) {
		Car myCar = new Car("Toyota", 2020, "Corolla");
		myCar.printCarDetails();
	}

}

/**
 * Represents a generic vehicle with a name and a year of manufacture.
 * This class provides methods to initialize and print details of the vehicle.
 */
class Vehicle {

	private String vehicleName;
	private int year;

	/**
	 * Constructor a new vehicle with the given name and year.
	 *
	 * @param vehicleName The name of vehicle.
	 * @param year The year of manufacturing.
	 */
	Vehicle(String vehicleName, int year) {
		this.vehicleName = vehicleName;
		this.year = year;
	}

	/**
	 * This method print the detail of the vehicle.
	 * This includes the vehicle name and the year of manufacture.
	 */
	public void printVehicleDetails() {
		System.out.println("Vehicle name:" + this.vehicleName);
		System.out.println("Manufacturing year:" + this.year);
	}

}

/**
 * Represents a generic car with a model name.
 * This class extends all vehicle property.
 * This class provides methods to initialize and print details of the car.
 */
class Car extends Vehicle {

	private String modelName;

	/**
	 * Constructs a new vehicle with the given name and year.
	 *
	 * @param vehicleName The name of vehicle.
	 * @param year The year of manufacture.
	 * @param modelName The name of model.
	 */
	Car(String vehicleName, int year, String modelName) {
		super(vehicleName, year);
		this.modelName = modelName;
	}

	/**
	 * This method print the detail of the car, includes the model name.
	 * The method use super keyword to call parent the class method.
	 * The this keyword describes variable reference with in the same class.
	 */
	public void printCarDetails() {
		super.printVehicleDetails();
		System.out.println("Model name:" + this.modelName);
	}

}
