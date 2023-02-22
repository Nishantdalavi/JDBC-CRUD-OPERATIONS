package com.jsp.helper;
//register
//eastablish connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	String url = "jdbc:mysql://localhost:3306/javabatch";
	String username = "root";
	String password = "root";
	//2nd
	//Connection connection = null;
	Connection c = null;
	public Connection  getconnection() {
		//1st making getconnection method with return type connection
		
		try {
			// Load/Register the driver
			//1st
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2nd
		// connection = DriverManager.getConnection(url, username, password);
			c = DriverManager.getConnection(url, username, password);

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//return connection;
		return c;
	}
}
		
		
		
		
		
		
		
	
	


