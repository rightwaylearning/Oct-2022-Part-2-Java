package one.to.one;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class SaveData {

	public static void main(String[] args) throws Exception {


		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
 

		Person p = new Person(111, "Akash Madhawal", "Uterakhand");

		Passport pass = new Passport();
		pass.setPassportNumber(787878);
		pass.setFromDate("25-05-2023");
		pass.setToDate("24-05-2033");
		pass.setPerson(p);
		  session.save(pass);
		
		tx.commit();
		session.close();
	}
}
