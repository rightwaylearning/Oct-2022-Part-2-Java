package file.writter.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		
		File f = new File("H:\\FilehandlingFolders\\textfile.txt");
		
		FileWriter f1 = new FileWriter(f,true);
		// writer
		PrintWriter pr = new PrintWriter(f1);
		pr.println();
		pr.println(1000);
		pr.println("Hello Good morning india");
		pr.println('B');
		pr.print(true);
		pr.flush();
		pr.close();
		
		
		// reader
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = br.readLine();
		while(str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
	}
}
