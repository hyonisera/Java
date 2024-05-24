package Chap07;

public class Dog3 {
	public String breed;
	public String color;
	protected int age;
	private String name; //다른 클래스에서는 접근 불가
	
	public void bowwow() {
		System.out.println("멍멍 짖다");
	}
	protected void run() {
		System.out.println("달리다");
	}
	private void sleep() {
		System.out.println("잠을 자다");
	}
}
