package corejava.com;

/**
 * The program to demonstrate the default constructor and parameterized constructor.
 * In this program we have use constructor chaining.
 *
 * @author Naitik
 */
public class Constructor {

	private float length;
	private float width;

	Constructor() {
		System.out.println("Area of rectangle is:" + areaOfRectangle());
	}

	/**
	 * The constructor create new object with given parameter length and width.
	 * 
	 * @param length The length of object.
	 * @param width The width of object.
	 */
	Constructor(float length, float width) {
		this(); // Call the default constructor using this() keyword
		this.length = length;
		this.width = width;
	}

	/**
	 * The method is calculate area of rectangle.
	 * To find the area of a rectangle, use its length and width.
	 */
	public float areaOfRectangle() {
		return length * width;
	}

	public static void main(String[] args) {
		Constructor constructor = new Constructor(10.f, 9.5f);
		System.out.println("Area of rectangle is:" + constructor.areaOfRectangle());
	}

}
