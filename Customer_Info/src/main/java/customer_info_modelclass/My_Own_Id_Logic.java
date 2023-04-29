package customer_info_modelclass;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class My_Own_Id_Logic implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
		
		Customer cust = (Customer) obj;
		String firstHalf = cust.getMail().split("@")[0];
		String secondHalf =  cust.getCellno().substring(0,4);
		String primaryKey = "C - "+ firstHalf +secondHalf;
		System.out.println("id= " +primaryKey);
		return primaryKey;
	}
	
	

}
