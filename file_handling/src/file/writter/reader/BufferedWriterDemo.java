package file.writter.reader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterDemo {
	
	public static void main(String[] args) throws Exception{
		
		File f = new File("H:\\FilehandlingFolders\\bigfile.txt");
		
		// if u select FileWriter then u can directly communicate with file or may be u can use file object to communicate
		FileWriter fr= new FileWriter(f,true);
		
		// BufferedWriter never communicate to file need some writer
		BufferedWriter buff = new BufferedWriter(fr);
		
		// buff.write(int char);// If I want write 'A'  buff.write(65)
		// buff.write(char[] arr);
		// buff.write(String str)
		// buff.newLine();
		// buff.flush();
		// buff.close();
		
		buff.write(65);
		buff.newLine();
		char[] arr = {'K','I','L','L'};
		buff.write(arr);
		buff.newLine();
		buff.write("Hello Good morning India.");
		buff.flush();
		buff.close();
		
		
	}

}
