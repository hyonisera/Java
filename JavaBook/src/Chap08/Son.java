package Chap08;

public class Son extends Father{
	String name = "홍길동";
	
	void printDetails() {
		System.out.println("나의 이름은 " + this.name); //this.은 현재 객체를 가리킴
		System.out.println("나의 아버지는 " + this.familyName);
		System.out.println("나의 집은 " + this.houseAddress);
	}
}
