package flie.opt;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindOutFoldetAndFileCount {

	public static void main(String[] args) {
		 int fileCount = 0;
		 int folderCount = 0;
		 
		File file= new File("H:\\HTML-REPO-JAN-2023\\html-Jan-2023");
		
		 String[] list =   file.list();
		
		 for(String str :list) {
				File f= new File("H:\\HTML-REPO-JAN-2023\\html-Jan-2023\\",str);
		 
				if(f.isFile()) {
					fileCount++;
				}else if(f.isDirectory()) {
					folderCount++;
							
				}
		 }
		 
		 System.out.println("Total File count:"+fileCount);
		 System.out.println("Total folder count" + folderCount);
		    
	     
	}
}
