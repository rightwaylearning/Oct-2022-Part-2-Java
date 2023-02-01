package file.read.write.opt;

import java.io.FileWriter;

public class WriteDataInExistingFile{

	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("D:\\MyFiles\\test.txt", true);
		writer.write(66);
		writer.flush();
		writer.close();
	}
}
