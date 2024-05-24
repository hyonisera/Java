package Chap07;

public class Student2 {
	int id;
	String name;
	
	Student2() {
		System.out.println("기본 생성자 Student2() 호출");
	}
	void insertRecord(int parm1, String parm2) {
		id = parm1;
		name = parm2;
	}
	void printInfo() {
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
	}
}
