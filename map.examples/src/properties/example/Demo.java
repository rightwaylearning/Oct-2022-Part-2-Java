package properties.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Demo {

	public static void main(String[] args) throws Exception {

		Properties p = new Properties();

		File f = new File("H:\\filedata\\file.properties");
		FileInputStream file = new FileInputStream(f);
		p.load(file);

		System.out.println(p);
		System.out.println(p.getProperty("server"));

		// ----------------------------------

		Properties p1 = new Properties();
		p1.setProperty("lname", "sharma");
		p1.setProperty("fname", "rohit");

		File f1 = new File("H:\\filedata\\file1.properties");
		if (!f1.exists()) {
			f1.createNewFile();
		}
		
		FileOutputStream out=new FileOutputStream(f1);
        p1.store(out, "data written in file1");
	}

}
