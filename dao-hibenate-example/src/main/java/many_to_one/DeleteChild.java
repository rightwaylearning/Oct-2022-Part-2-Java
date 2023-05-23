package many_to_one;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class DeleteChild {

	public static void main(String[] args) throws Exception{
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		
		PatientNew p = session.get(PatientNew.class,111);
		if(p != null) {
			
			session.delete(p);
		}
		
		tx.commit();
		session.close();
	}
}
