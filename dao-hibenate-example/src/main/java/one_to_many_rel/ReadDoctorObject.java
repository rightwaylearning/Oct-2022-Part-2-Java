package one_to_many_rel;

import java.util.HashSet;
import java.util.Set;

import javax.print.Doc;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class ReadDoctorObject {

public static void main(String[] args) throws Exception {
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		
		Doctor dr = session.get(Doctor.class, 101);
		System.out.println(dr);
		
		session.close();
	}
}
