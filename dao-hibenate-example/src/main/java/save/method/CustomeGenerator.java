package save.method;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import movie.model.Movie;

public class CustomeGenerator implements IdentifierGenerator {

	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		try {
			Movie m = (Movie)object;
			System.out.println(m);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-MM-mm-ss");
			//return simpleDateFormat.format(new Date());
			int i = (int) Math.random();
			System.out.println(i);
			return i;
		} catch (Exception e) {
			System.out.println("exception ale ahe re bhai");
			e.printStackTrace();
		}
		return null;
	}

}
