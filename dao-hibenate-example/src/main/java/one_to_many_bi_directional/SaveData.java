package one_to_many_bi_directional;

import java.awt.image.BandCombineOp;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.functionality.GetSessionFactroy;

public class SaveData {

	public static void main(String[] args) throws Exception {

		Session session = GetSessionFactroy.getSessionfactroy().openSession();

		Transaction tx = session.beginTransaction();

		Patient p1 = new Patient(111, "AA", 32);
		Patient p2 = new Patient(222, "BB", 34);
		Patient p3 = new Patient(333, "CC", 36);
		Doctor dr = new Doctor(101, "Atul rajan", "MD");
		p1.setDoctor(dr);
		p2.setDoctor(dr);
		p3.setDoctor(dr);

		Set<Patient> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);

		dr.setSet(set);

		session.save(p1);

		tx.commit();
		session.close();

	}
}
