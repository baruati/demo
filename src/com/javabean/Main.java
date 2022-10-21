package com.javabean;

import com.dao.StudentDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1= new Student(105, "Himo", "Sociology");
		StudentDao dao= new StudentDao();
//		boolean b= dao.insertStudent(s1);
//		if(b)
//			System.out.println("successfully inserted");
//		else
//			System.err.println("Error occoured");
//		boolean b=dao.updateStudent(103, "B-Tech");
//		boolean b= dao.deleteStudent(103);
//		if(b)
//			System.out.println("successfully deleted");
//		else
//			System.err.println("Error occoured");
	System.err.println(dao.getStudents());
//		

	}

}
