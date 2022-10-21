package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.JDBCConnection.JDBC;
import com.javabean.Student;
import com.mysql.cj.protocol.Resultset;

public class StudentDao {
	public boolean insertStudent(Student student) {
		String sql="insert into student values(?,?,?)";
		try {
			PreparedStatement pst=JDBC.getConnection().prepareStatement(sql);
			pst.setInt(1, student.getStdId());
			pst.setString(2, student.getStdName());
			pst.setString(3, student.getStdCourse());
			return pst.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
public boolean updateStudent(int stdId,String course) {
	String sql= "update student set scourse=? where sid=?";
	try {
		PreparedStatement pst= JDBC.getConnection().prepareStatement(sql);
		pst.setString(1, course);
		pst.setInt(2, stdId);
		return pst.executeUpdate()>0;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return false;
	
}
public boolean deleteStudent(int id) {
	String sql="delete from student where sid =?";
	PreparedStatement pst;
	try {
		pst = JDBC.getConnection().prepareStatement(sql);
		pst.setInt(1, id);
		return pst.executeUpdate()>0;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	
}
public List<Student> getStudents(){
	List<Student> list= new ArrayList<>();
	String sql="select * from student";
	try {
		PreparedStatement pst= JDBC.getConnection().prepareStatement(sql);
		ResultSet res= pst.executeQuery();
		while(res.next()) {
		Student st= new Student();
		st.setStdId(res.getInt(1));
		st.setStdName(res.getString(2));
		st.setStdCourse(res.getString(3));
		
			
			list.add(st);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return list;
	
	
}
}
