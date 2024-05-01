package collection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This program demonstrates file handling operations such as creating, writing to, and deleting a text file.
 * 
 * @author Naitik
 */
public class CreateAndWriteFile {

	public static void main(String[] args) {
		CreateAndWriteFile fileHandling = new CreateAndWriteFile();
		fileHandling.createTextFile(); // Create text file
		fileHandling.writeFile(); // Write text in file
		fileHandling.deleteTextFile(); // Delete text file
	}

	/**
	 * This method creates a text file named "MyDocument.txt".
	 * If the file already exists, it displays a message indicating that the file already exists.
	 * If an input output exception occurs during file creation, it prints the exception stack trace.
	 */
	public void createTextFile() {
		try {
			File createFile = new File("MyDocument.txt");
			if (createFile.createNewFile()) {
				System.out.println("File create successful: " + createFile.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException inputOutputException) {
			System.out.println("Create file exception occurred.");
			inputOutputException.printStackTrace();
		}
	}

	/**
	 * This method writes text to the "MyDocument.txt" file.
	 * It uses the fileWriter class to write text to the file.
	 * If an IOException occurs during writing, it prints a message indicating the exception.
	 */
	public void writeFile() {
		try {
			FileWriter fileWriter = new FileWriter("MyDocument.txt");
			fileWriter.write("Name: Naitik Bagdi ");
			fileWriter.write("\nAge: 23");
			fileWriter.write("\nLocation: Ahmedabad.");
			fileWriter.close(); // Close the file writer object
			System.out.println("Successfully wrote to the file ");
		} catch (IOException inputOutputException) {
			System.out.println("File writer exception occourred ");
		}
	}

	 /**
	 * This method deletes the "MyDocument.txt" file.
	 * If the file is successfully deleted, it displays a message indicating the file was deleted.
	 * If deletion fails, it displays a message indicating the failure.
	 */
	public void deleteTextFile() {
		try {
			File deleteFile = new File("MyDocument.txt");
			if (deleteFile.delete()) {
				System.out.println("Delete the file: " + deleteFile.getName());
			} else {
				System.out.println("Faild to delete the file. ");
			}
		} finally {
			System.out.println("Done");
		}
	}

}
