package one_to_many_rel_using_list;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class AddPatientToExistingDoctor {

	public static void main(String[] args) throws Exception{
		
		Session session= GetSessionFactroy.getSessionfactroy().openSession();
		
		Doctor dr = session.get(Doctor.class,101);
		
		Transaction tx = session.beginTransaction();
		if(dr != null) {
			Patient p1= new Patient(11, "Madhu", 30);
			Patient p2= new Patient(22, "Sunil", 34);
			Patient p3= new Patient(33, "Sindhu", 32);
			List<Patient> set = new ArrayList<>();
			set.add(p1);set.add(p2);set.add(p3);
			dr.setSet(set);
		}
		session.flush();
		tx.commit();
		session.close();
		
	}
}
