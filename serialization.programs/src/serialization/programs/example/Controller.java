package serialization.programs.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Controller {

	public static void main(String[] args) throws Exception {
		
		
		// -----------------------------------------------------
		  // de-serialization
		
		FileInputStream input = new FileInputStream("mydata.txt");
		ObjectInputStream obj1 = new ObjectInputStream(input);
		Student s1 = (Student)obj1.readObject();
		
		System.out.println(s1.firstName);
		System.out.println(s1.lastName);
		System.out.println(s1.rollNumber);
		System.out.println("deserialization is done");
		
	}
}
