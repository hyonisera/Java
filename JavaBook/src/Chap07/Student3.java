package Chap07;

public class Student3 {
	int id;
	String name;
	
	Student3() {
		System.out.println("기본 생성자 Student3() 호출");
	}
	Student3(int parm1, String parm2) {
		System.out.println("일반 생성자 Student(...) 호출");
		id = parm1;
		name = parm2;
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
