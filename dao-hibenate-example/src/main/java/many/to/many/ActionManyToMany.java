package many.to.many;

import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class ActionManyToMany {

	public static void main(String[] args) throws Exception {
		
		Book b1 = new Book(101,"Java",null);
		Book b2 = new Book(102,"JavaScript",null);
		
		Author a1 = new Author(1,"Geeta",null);
		Author a2 = new Author(2,"Seeta",null);
		Author a3 = new Author(3,"Ramaya",null);
		
		
		Set<Author> collection1 = new LinkedHashSet<>();
		collection1.add(a1);
		collection1.add(a2);
		b1.setAuthorList(collection1);
		
		
		Set<Author> collection2 = new LinkedHashSet<>();
		collection2.add(a1);
		collection2.add(a3);
		b2.setAuthorList(collection2);
		
		
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		
		
		tx.commit();
		session.close();
		
	}
}
