package flie.opt;

import java.io.File;
import java.io.IOException;

public class CreateFileAndFolder {

	public static void main(String[] args) throws IOException{
		
		File f= new File("sample.pdf");
		System.out.println(f.exists());  // false
		f.createNewFile();
		System.out.println(f.exists()); // true
	}
}
