package externalizable.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ConvertFiletoObject {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file= new FileInputStream("student1.txt");
		ObjectInputStream obj = new ObjectInputStream(file);
		
		Student s= (Student)obj.readObject();
		System.out.println(s);
		
	}
}
