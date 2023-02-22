package com.jsp.controller;
//driver
//3rd pakage

import com.jsp.dao.TestAdd;
import com.jsp.dto.Student;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(111);
		student.setName("Adam");
		student.setEmail("Adam@gmail.com");
		//after creating retun student at dao
		TestAdd studentDao = new TestAdd();
		Student s1 = studentDao.saveStudent(student);
		System.out.println(s1.getId()+" has been fineshed");
	}

}
