package one_to_many_rel;

import javax.print.Doc;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class DeleteRecord {
	public static void main(String[] args) throws Exception {
		
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		Doctor d = session.get(Doctor.class, 101);
		
		if(d != null) {
			session.delete(d);
		}
		tx.commit();
		session.close();
		
	}

}
