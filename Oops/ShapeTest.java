package oopsconcept.abstraction;

/**
 * This program demonstrate abstraction.
 * 
 * @author Naitik
 */
public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.print(circle.areaCalculate());

		Rectangle rectangle = new Rectangle(10.5, 11.5);
		System.out.println(rectangle.areaCalculate());
	}

}

/**
 * The abstract class represent a shap with an abstract method areaCalculate to calculate the area.
 * In this method, an abstract method is use to calculate area.
 */
abstract class Shape{

	abstract double areaCalculate();

}

// Represents a circle, extending the abstract shape class
class Circle extends Shape {

	// Constant representing the mathematical value of 'PI'
	private final double PI = 3.14;
	private double radius;

	/**
	 * Constructor for circle, initializes the radius.
	 * 
	 * @param radius The radius of the circle.
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	/**
	 * Overrides the areaCalculate method to calculate the area of the circle.
	 * 
	 * @return The area of the circle.
	 */
	@Override
	double areaCalculate() {
		radius = PI * ( radius * radius );
		return radius;
	}

}

// Represent a rectangle, extending the abstract shape class.
class Rectangle extends Shape {

	private double length;
	private double width;

	/**
	 * Constructor for rectangle, initializes the radius.
	 * 
	 * @param radius The radius of the circle.
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * Overrides the areaCalculate method to calculate the area of the circle.
	 * 
	 * @return The area of the circle.
	 */
	@Override
	double areaCalculate() {
		return length * width;
	}

}
