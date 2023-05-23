package one_to_many_rel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class SaveDoctorObject {

	public static void main(String[] args) throws Exception {
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		
		Patient p1= new Patient(111, "Madhu", 30);
		Patient p2= new Patient(222, "Sunil", 34);
		Patient p3= new Patient(333, "Sindhu", 32);
		List<Patient> set = new ArrayList<>();
		set.add(p1);set.add(p2);set.add(p3);
		
		Doctor dr = new Doctor(102, "Mr Mahidra", "MBBS(MD)", set);
		
		
		Integer i = (Integer) session.save(dr);
		
		System.out.println(">>>>>>>>>>"+i);
		
		tx.commit();
		session.close();
	}
}
