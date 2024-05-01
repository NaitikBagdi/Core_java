package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * This class describe the map interface.
 * 
 * @author Naitik
 */
public class PatientDetails {

	public static void main(String[] args) {
		Map<Integer, String> patientList = new HashMap<Integer, String>();
		patientList.put(101, "Vishal");
		patientList.put(102, "Nikhil");
		patientList.put(103, "Akshay");

		// Print the contents of the patientList before any manipulation
		System.out.println("Before manipulation:");

		for (Map.Entry<Integer, String> mapList : patientList.entrySet()) {
			System.out.println(mapList.getKey() + " " + mapList.getValue());
		}

		patientList.remove(101); // Remove element in list
		patientList.put(101, "Mukesh"); // Add new element in list
		patientList.replace(102, "Abhishek"); // Replace specific key
		System.out.println(patientList.containsKey(103)); // Contains key check given key is exist or not
		System.out.println("After manipulation: ");

		// Iterate using entry set.
		for (Map.Entry<Integer, String> entry : patientList.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
