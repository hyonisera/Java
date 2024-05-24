package Chap07;

public class Example02 {
	static void myMethod1() {
		System.out.println("정적 메서드 호출");
	}
	public void myMethod2() {
		System.out.println("인스턴스 메서드 호출");
	}
	public static void main(String[] args) {
		myMethod1();
		Example02 myObj = new Example02(); //static을 안붙이면 객체를 만들어서 .을 찍고 접근해야 함, static 잘 안 씀
		myObj.myMethod2();
	}
}
