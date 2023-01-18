package serialization.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AddressSerialization {

	public static void main(String[] args) throws Exception {
		// convert java object state/data into file format is called serialization
		
		Address adr = new Address("c 505, B A vermont society", "baif road wagholi", "PUNE", 999999);

		FileOutputStream file = new FileOutputStream("address.txt");
		ObjectOutputStream obj = new ObjectOutputStream(file);
		obj.writeObject(adr);
		System.out.println("done");
	}
}
