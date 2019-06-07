package com.yedam.cbk;
public class Student {
	
	private String studentNo;
	private String name;
	private String major;
	private String birthday;
	Student(){
	}
	Student(String studentNo, String name, String major){
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
	
	String getStudentNo() {
		return this.studentNo;
	}
	String getName() {
		return this.name;
	}
	String getMajor() {
		return this.major;
	}
	String getbirthday() {
		return this.birthday;
	}
	void setbirthday(String birthday) {
		this.birthday = birthday;
	}
	void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	void setName(String name) {
		this.name = name;
	}
	void setMajor(String major) {
		this.major = major;
	}
	public void getStudentInfo() {
	    System.out.println("학번 : " + studentNo + ", 이름: " + name +",전공: " + major + ",생일: " + birthday);
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", major=" + major + "]";
	}
	
}