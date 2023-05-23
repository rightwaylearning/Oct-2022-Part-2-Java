package many_to_one;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class SaveDoctorObject {

	public static void main(String[] args) throws Exception {
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		
		
		DoctorNew dr = new DoctorNew(102, "Mr Mahidra", "MBBS(MD)");
		
		PatientNew p1= new PatientNew(111, "Madhu", 30,dr);
		PatientNew p2= new PatientNew(222, "Sunil", 34,dr);
		PatientNew p3= new PatientNew(333, "Sindhu", 32,dr);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tx.commit();
		session.close();
	}
}
