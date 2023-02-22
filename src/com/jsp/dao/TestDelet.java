package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class TestDelet {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";

		// String sql = "INSERT INTO student VALUES (1024,'XYZ','XYZ@EMAIL.COM')";
		String sql = "DELETE FROM STUDENT WHERE ID = 70";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			int res = statement.executeUpdate(sql);
			if (res > 0) {
				System.out.println("object deleted");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
				System.out.println("All done");
			}

		}

	}

}
