package flie.opt;

import java.io.File;

public class CreateFolderAndFile {

	public static void main(String[] args) throws Exception{
		
		File f1= new File("mydoc");
		f1.mkdir();
		
		File f2=new File(f1,"my_resume.pdf");
		if(!f2.exists()) {
			f2.createNewFile();
		}
		System.out.println("done");
	}
}
