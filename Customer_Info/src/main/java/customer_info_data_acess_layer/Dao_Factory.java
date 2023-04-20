package customer_info_data_acess_layer;

public class Dao_Factory {
	public static CustomerDao getcustomerDaoInstace() {
		CustomerDao dao = new Customer_Daoimpl();
		return dao;
	}

}
