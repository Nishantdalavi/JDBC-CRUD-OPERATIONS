package com.jsp.dao;
//data accass object

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.Student;

import com.jsp.helper.HelperClass;

public class TestAdd {
	HelperClass helperclass = new HelperClass();
	public Student  saveStudent (Student student) {
		Connection connection = helperclass.getconnection();
		//3rd                    //making connection from helperclass
		String sql ="INSERT INTO student VALUES(?,?,?)";

		try {
			//1st
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
//2nd		//excutes multiple times statement   //input querry
			preparedStatement.setInt(1,student.getId());
			//featching the data
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			preparedStatement.execute();
			connection.close();
			//mandatory
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;


		
		
		

	}

}
