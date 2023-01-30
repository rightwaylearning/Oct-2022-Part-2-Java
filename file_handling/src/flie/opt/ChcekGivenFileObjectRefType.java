package flie.opt;

import java.io.File;
import java.io.IOException;

public class ChcekGivenFileObjectRefType {
	
	
	static void showType(File f) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}
	
	
	

	public static void main(String[] args) throws IOException{
		
		File f = new File("new_file.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		showType(f);
		File f1= new File("new_folder");
		f1.mkdir();
		showType(f1);
		
		
	}
}
