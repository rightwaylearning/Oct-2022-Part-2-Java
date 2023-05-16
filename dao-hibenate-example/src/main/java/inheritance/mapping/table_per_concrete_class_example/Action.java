package inheritance.mapping.table_per_concrete_class_example;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class Action {

	public static void main(String[] args) throws Exception {
		
		
		// here insert card payment objcet
		
//		Session session = GetSessionFactroy.getSessionfactroy().openSession();
//		Transaction tx = session.beginTransaction();
//		Card1 card = new Card1(9123, "VISA", 569034, 9000.0, new Date().toString());
//		Integer i =  (Integer) session.save(card);
//		System.out.println(">>>>>>>>>>>>>>>>"+i);
//		tx.commit();
//		session.close();
		
		// insert cheque object
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		Cheque1 ch = new Cheque1(67465, "account_pay", 65234, 41000.0, new Date().toString());
		Integer i =  (Integer) session.save(ch);
		System.out.println(">>>>>>>>>>>>>>>>"+i);
		tx.commit();
		session.close();
		
	}
}
