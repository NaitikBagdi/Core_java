package oopsconcept.inheritance.multilevel;

/**
 * This program demonstrate multilevel inheritance.
 * The student info class content student all details.
 * 
 * @author Naitik
 */
public class StudentInfo {

	public static void main(String[] args) {
		CollegeStudent collegeStudent = new CollegeStudent("Naitik", 23, 101, "RIET");
		collegeStudent.collegeDetails();
	}

}

// The person class show name and age
class Person {

	private String name;
	private int age;

	/**
	 * Constructor for person, initializes name and age.
	 * 
	 * @param name The name of person name.
	 * @param age The age of person age.
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// This method describe about person
	public void personDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}

/**
 * Student class content student id.
 * It extend the person class
 */
class Student extends Person {

	private int studentId;

	/**
	 * Constructor for student.
	 * 
	 * @param name The name for person name.
	 * @param age The age for person age.
	 * @param studentId The id for student id.
	 */
	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	// The method print details of students
	public void studentDetails() {
		super.personDetails();
		System.out.println("Student id: " + studentId );
	}

}

/**
 * This class content college name.
 * This class extend student class.
 */
class CollegeStudent extends Student {

	private String collegeName;

	/**
	 * Constructor for college student, initializes the name age student id and college name.
	 * 
	 * @param name The name of the person name.
	 * @param age The age of the person age.
	 * @param studentId The id of the student id.
	 * @param collegeName The name of the college name.
	 */
	public CollegeStudent(String name, int age, int studentId, String collegeName) {
		super(collegeName, age, studentId);
		this.collegeName = collegeName;
	}

	// The method print about the college name
	public void collegeDetails() {
		super.studentDetails();
		System.out.println("College Name: " + collegeName);
	}

}
