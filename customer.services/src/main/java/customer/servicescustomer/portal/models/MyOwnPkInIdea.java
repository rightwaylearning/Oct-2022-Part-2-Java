package customer.servicescustomer.portal.models;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyOwnPkInIdea implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		Customer cust = (Customer)object;
		String firstHalf = cust.getMailId().split("@")[0];
		String secondHalf =  cust.getCellNumber().substring(0,4);
		
		String primaryKey = "C - "+ firstHalf +secondHalf;
		System.out.println("PK = " +primaryKey);
		return primaryKey;
	}

}

 
 
 
 