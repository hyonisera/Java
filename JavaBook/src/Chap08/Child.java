package Chap08;

public class Child extends Parent {
	String name = "홍길동";
	
	public void details() {
		super.details(); //부모 클래스의 details를 실행
		System.out.println(name);
	}
	public void printDetails() {
		details();
		System.out.println("부모 이름: " + super.name); //부모 클래스의 name
		System.out.println("자식 이름: " + name);
	}
}
