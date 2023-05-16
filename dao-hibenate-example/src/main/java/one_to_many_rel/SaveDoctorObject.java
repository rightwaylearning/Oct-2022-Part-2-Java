package one_to_many_rel;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class SaveDoctorObject {

	public static void main(String[] args) throws Exception {
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		
		Patient p1= new Patient(11, "Madhu", 30);
		Patient p2= new Patient(22, "Sunil", 34);
		Patient p3= new Patient(33, "Sindhu", 32);
		Set<Patient> set = new HashSet<>();
		set.add(p1);set.add(p2);set.add(p3);
		
		Doctor dr = new Doctor(101, "Mr Sharad", "MBBS", set);
		
		
		Integer i = (Integer) session.save(dr);
		
		System.out.println(">>>>>>>>>>"+i);
		
		tx.commit();
		session.close();
	}
}
