package flie.opt;

import java.io.File;
import java.io.IOException;

public class GoodWayToCreateFile {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File("resume.doc");
		// if resume.doc file is exists then point to that file if not then ignore
		
		boolean b = f.exists();
		
		 if(!b) {
			 f.createNewFile();
		 }
	}
}
