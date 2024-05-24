package Chap07;

public class Student2_2 { //학생 정보를 나타내는 클래스
	int id; //멤버 변수 선언
	String name;
	
	Student2_2() { //기본 생성자 선언
		System.out.println("기본 생성자 Student() 호출");
	}
	
	//학생의 아이디와 이름을 입력받아 멤버 변수에 저장하는 메서드
	void insertRecord(int parm1, String parm2) {
		id = parm1;
		name = parm2;
	}
	void printInfo() { //학생의 아이디와 이름을 출력하는 메서드
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
	}
}
