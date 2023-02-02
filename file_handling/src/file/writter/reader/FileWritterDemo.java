package file.writter.reader;

import java.io.File;
import java.io.FileWriter;

public class FileWritterDemo {

	public static void main(String[] args) throws Exception{
		
		File f = new File("H:\\FilehandlingFolders\\textfile.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		
		FileWriter fr = new FileWriter(f,true);
	      // 1] fr.write(int ch); fr.write(65);
		 //  2] fr.write(char[] arr)
         //  3] fr.write(String str);
		 //  4] fr.flush() && fr.close();
		// limitations here If u want to say please write to next line need
		 // to next line character manually like e.g fr. write("\n")
		
		 fr.write(65); // A
		 fr.write(66); // B
		 fr.write("\n"); //new line
		 char[] arr = {'L','m','n','p'};
		 fr.write(arr);
		 fr.write("\n"); //new line
		 fr.write("I am string pparam");
		 fr.flush();
		 fr.close();
		 
		 		
	}
}
