package Chap05;

public class Example01 {
	
	public static void method() { //input 값이 없을 때만 호출됨
		System.out.println("static 메서드입니다.");
		System.out.println(5 + 6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(); //input 값이 있으면 새로운 메서드를 만들어야 됨
	}

}
