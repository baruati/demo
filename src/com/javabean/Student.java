package com.javabean;

public class Student {
	private int stdId;
	private String stdName;
	private String stdCourse;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdCourse() {
		return stdCourse;
	}
	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}
	public Student(int stdId, String stdName, String stdCourse) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdCourse = stdCourse;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdCourse=" + stdCourse + "]";
	}
	

}
