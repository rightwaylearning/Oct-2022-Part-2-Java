package file.writter.reader;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception{
		
		File f = new File("H:\\FilehandlingFolders\\textfile.txt");
		//FileReader fr = new FileReader("write full path");
		FileReader fr = new FileReader(f);
		
		//char ch = (char)fr.read(); // read method return Uni code value
		// if file is over fr.read() return -1
		
		// read character by character
//		int ch=fr.read();
//		while(ch != -1) {
//			char c = (char)ch;
//			System.out.print(c);
//			ch = fr.read();
//		}
//		
//		fr.close();
		
		// here problem is we are reading character by character 
		// solution
		
		long charSize = f.length();
		char[] arr = new char[(int)charSize];
		
		fr.read(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		fr.close();
		
	}
}
/*
 Note File
      FileWriter : - here we have to add newline character manually "\n"
      FileReader :- read character by character 
      
      solution
      go with
      
      BufferedWriter
      BufferedReader
 
 
 */





