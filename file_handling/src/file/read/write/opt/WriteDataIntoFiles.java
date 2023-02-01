package file.read.write.opt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFiles {

	public static void main(String[] args) throws IOException{
//		String rootPath = "D:\\MyFiles\\";
//		
//		File f= new File(rootPath ,"abc.txt");
//		 if(!f.exists()) {
//			 f.createNewFile();
//		 }
//		 
//		FileWriter w = new FileWriter(f);
//		
//		w.write("HI hello How are u");
//		w.flush();
//		w.close();
		
		FileWriter writer = new FileWriter("D:\\MyFiles\\test.txt");
		writer.write("Hello Good morning");
		writer.write("\n");
        writer.write(97);
        writer.write("\n");
        writer.write("This my end line");
		writer.flush();
		writer.close();
		
	}
}
