package com.yedam.cbk;

public class StudentExample {

	public static void main(String[] args) {
		int num = 10;
		Student student = new Student("1111-1111","홍길동", "English");
		
		System.out.println(student.getStudentNo());
		System.out.println(student.getName());
		System.out.println(student.getMajor);
		System.out.println(student.getbirthday));
		
		//1)Student 필드에 학생생일 담을 수 있는 필드 선언. 
		//set.get 메소드
		//2)student 클래스의 메소드 추가
		//void getStudentInfo() => 학번: 1111, 이름: 홍길동
		//전공 :English, 생일: 1990년 10월 8일
//
		student.getStudentInfo();
        

	}

}
