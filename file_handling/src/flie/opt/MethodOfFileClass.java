package flie.opt;

import java.io.File;
import java.io.IOException;

public class MethodOfFileClass {

	public static void main(String[] args) throws IOException {
		
		File f= new File("java_notes.txt");
		// here we created new file object f is pointing file java_notes.txt if exist
		
		f.exists(); // boolean
		// return true or false;
		
		f.createNewFile();
		 // return type is boolean
		 // true :-  if file creation done 
		 // if not then return false;
		
		File f2= new File("my_images");
		f2.mkdir();
		// here new folder creation is done
		// boolean  : true if folder is created , false if not created
		
		
		
		
		
		
	}
}
