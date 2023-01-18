package transient_modifer;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class profileDeSerialization {

	public static void main(String[] args) throws Exception {
	
		FileInputStream file = new FileInputStream("user_login_info.txt");
		ObjectInputStream obj = new ObjectInputStream(file);
		
		Profile p = (Profile)obj.readObject();
		
		System.out.println(p.userName);
		System.out.println(p.password);
		System.out.println(Profile.email);
	}
}
