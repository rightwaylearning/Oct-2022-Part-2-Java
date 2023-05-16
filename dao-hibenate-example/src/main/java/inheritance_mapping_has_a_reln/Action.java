package inheritance_mapping_has_a_reln;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class Action {
	public static void main(String[] args) throws Exception {

		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();

		Employee e = new Employee(1001, "Miss Madhu", 56789.00,
				new Address("MG-78/90", "Pragati nagar ,Hadpsar,Pune", 456789));
		Integer i = (Integer) session.save(e);
		System.out.println(i);
		tx.commit();
		session.close();
	}
}
