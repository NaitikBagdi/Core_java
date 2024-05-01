package oopsconcept.interfaces;

/**
 * The class is describe interface.
 * 
 * @author Naitik
 */
public class InterfaceExample {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("Rectangle:");
		System.out.println("Area of rectangle:" + rectangle.calculateArea());
		System.out.println("Perimeter of rectangle:" + rectangle.calculatePerimeter());

		Circle circle = new Circle(15);
		System.out.println("Circle:");
		System.out.println("Area of circle:" + circle.calculateArea());
		System.out.println("Perimeter of circle:" + circle.calculatePerimeter());
	}

}

/**
 * The interface contains two method calculateArea and calculate perimeter.
 * It calculate are and perimeter.
 */
interface Shape {

	double calculateArea();
	double calculatePerimeter();

}

/**
 * The rectangle class implements shape interface.
 * It calculates the area of rectangle and perimeter of rectangle.
 */
class Rectangle implements Shape {

	private double length;
	private double width;

	/**
	 * Constructor a rectangle with the given length and width.
	 * 
	 * @param length The length of the rectangle.
	 * @param width  The width of the rectangle.
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * Calculates the area of the rectangle.
	 * 
	 * @return The area of the rectangle.
	 */
	@Override
	public double calculateArea() {
		return length * width;
	}

	/**
	 * Calculates the perimeter of the rectangle.
	 * 
	 * @return The perimeter of the rectangle.
	 */
	@Override
	public double calculatePerimeter() {
		return 2 * (length + width );
	}

}

/**
 * The circle class implements the shape interface.
 * It calculates the area and perimeter of a circle.
 */
class Circle implements Shape {

	private double radius;
	private final float PI = 3.14f;

	/**
	 * Constructs a circle with the given radius.
	 * 
	 * @param radius The radius of the circle.
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	/**
	 * Calculate a circle with the given readius.
	 * 
	 * @param radius The radius of the circle.
	 */
	@Override
	public double calculateArea() {
		return PI * radius * radius;
	}

	/**
	 * Calculates the area of the circle.
	 * 
	 * @param The are of the circle
	 */
	@Override
	public double calculatePerimeter() {
		return 2 * PI * radius;
	}

}
