package transient_modifer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ProdileSerialization {

	public static void main(String[] args)throws Exception {
		Profile p = new Profile();
		p.userName = "test";
		p.password = "123456";
		
		FileOutputStream file = new FileOutputStream("user_login_info.txt");
		ObjectOutputStream obj = new ObjectOutputStream(file);
		obj.writeObject(p);
		System.out.println("done");
	}
}
