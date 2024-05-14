package collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The program read text file and display.
 * 
 * @author Naitik
 */
public class ReadFile {

	public static void main(String[] args) {
		try {
			File readFile = new File("MyDocument.txt");
			Scanner scannerReader = new Scanner(readFile); // Scanner for read the contents of the file
			while (scannerReader.hasNextLine()) {
				System.out.println(scannerReader.nextLine());
			}
			scannerReader.close(); // Close scanner reader object
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException occurred.");
			e.printStackTrace();
		}
	}

}