package serialization.programs.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationOfStudentObject {

	
	public static void main(String[] args) throws Exception {
		Student s= new Student();
		s.firstName = "kalpesh";
		s.lastName = "Jadhav";
		s.rollNumber = 23;
		
		// serialization
		
		FileOutputStream file= new FileOutputStream("mydata.txt");
		ObjectOutputStream obj = new ObjectOutputStream(file);
		obj.writeObject(s);
		System.out.println("Serialization is done");
	}
}
