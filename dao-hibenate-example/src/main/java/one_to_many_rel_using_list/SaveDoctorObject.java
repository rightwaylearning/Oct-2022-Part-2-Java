package one_to_many_rel_using_list;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class SaveDoctorObject {

	public static void main(String[] args) throws Exception {
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		
		
		
		Doctor dr = new Doctor(101, "Mr Sharad", "MBBS", null);
		
		
		Integer i = (Integer) session.save(dr);
		
		System.out.println(">>>>>>>>>>"+i);
		
		tx.commit();
		session.close();
	}
}
