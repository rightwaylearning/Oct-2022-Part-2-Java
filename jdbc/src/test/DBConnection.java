package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnection {

	public static void main(String[] args) throws Exception {
		
		// with help of jdbc api we are going to make connection between  java app & Mysql server
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		PreparedStatement stm = con.prepareStatement("insert into customers values(?,?,?,?)");
		
		stm.setInt(1, 11011);
		stm.setString(2, "Madhu");
		stm.setString(3, "madhu@gmail.com");
		stm.setString(4, "9876546789");
		
		int i = stm.executeUpdate();
		
		System.out.println(i);
	}
}
