package com.jsp.dao;




	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

	import java.sql.Statement;

	public class AllDeatails {

		public static void main(String[] args) throws SQLException {
			String url = "jdbc:mysql://localhost:3306/javabatch";
			String username = "root";
			String password = "root";

			// String sql = "INSERT INTO student VALUES (1024,'XYZ','XYZ@EMAIL.COM')";
			String sql = "SELECT * FROM student";
			Connection connection = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();
				ResultSet resultset = statement.executeQuery(sql);
				while(resultset.next()) {
					System.out.println(resultset.getInt(1));
					System.out.println(resultset.getString(2));
					System.out.println(resultset.getString(3));
					System.out.println("-------------------------------");
					}
				connection.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
					System.out.println("All done");
				}

			}

		}

	



