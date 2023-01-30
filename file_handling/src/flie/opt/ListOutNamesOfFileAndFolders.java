package flie.opt;

import java.io.File;

public class ListOutNamesOfFileAndFolders {

	public static void main(String[] args) {
		
		
		File f = new File("new_folder");
		
		if(f.exists() && f.isDirectory()) {
			
		String[] names = f.list();
		System.out.println(names.length);  // 3
		
		for(String name : names) {
			System.out.println(name);
		}
			
			
			
		}
	}
}
