package Chap07;

public class Dog2 {
	public String breed;
	public String color;
	protected int age; //패키지가 달라도 public이면 돌아감
	
	public void bowwow() {
		System.out.println("멍멍 짖다");
	}
	protected void run() {
		System.out.println("달리다");
	}
}
