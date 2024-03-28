package exceptionPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class FileCreation {

	public static void main(String[] args) throws Throwable {
		
		File f1 = new File("C:\\Users\\TAMIL\\OneDrive\\Desktop\\logme.txt");
		
		try {
//			FileInputStream fis = new FileInputStream(f1);
//			boolean f2 = FileAlreadyExistsException;
			throw new FileAlreadyExistsException("File already exist");
		}
//		catch (FileNotFoundException e) {
//			System.out.println(e.getMessage());
//			System.out.println("File not found");
//		}
		catch (FileAlreadyExistsException e) {
			f1.createNewFile();
//			File f1 = new File(f1);
			FileInputStream fis1 = new FileInputStream(f1);
		}
		finally {
			System.out.println("File Not found excpetion handled");
		}
		

	}

}
