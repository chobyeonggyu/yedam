 package com.yedam.cbk;

public class StudyClassMain {
	public static void main(String[] args) {
		StudyClass sclass = new StudyClass();
		// 1.반정보생성
		// 1.
		Professor professor = new Professor("p1111","pname1","english");
		Student student1 = new Student("s1111", "sname1", "english");
		Student student2 = new Student("s2222", "sname2", "english");
		Student student3 = new Student("s3333", "sname3", "english");
		Student[] studentAry = {student1, student2, student3};
		sclass.setClassName("English");
		sclass.setProfessor(professor);
		sclass.setStudentAry(studentAry);
		System.out.println(sclass);
	}
}
