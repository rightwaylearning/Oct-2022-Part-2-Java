package externalizable.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ConvertObjectoFile {

	public static void main(String[] args) throws Exception {
		
		Student s = new Student(23, "sawant", "h2345,lane 2,SE , mumbai");
		
		
		FileOutputStream file= new FileOutputStream("student1.txt");
		ObjectOutputStream obj = new ObjectOutputStream(file);
        obj.writeObject(s);
        
        System.out.println("here we are converted whole object into file format");
		
	}
}
