package flie.opt;

import java.io.File;

public class DeleteFileMethod {

	public static void main(String[] args) {
		
		File f= new File("new_file.txt");
		
		if(f.exists()) {
			f.delete();
		}
	}
}
