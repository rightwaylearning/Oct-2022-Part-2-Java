package transient_modifer;

import java.io.Serializable;

public class Profile implements Serializable{

	String userName;
	transient String password ="123456";
	transient static String email = "abc@gmail.com";
}
