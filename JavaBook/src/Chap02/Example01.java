package Chap02;

public class Example01 {
	
	public static void main(String[] args) {
		final int SPEED = 20; //final은 값을 변경할 수 없음
		int count = 10;
		//SPEED = 40;
		count = 11;
		
		System.out.print("상수 SPEED 값은 ");
		System.out.println(SPEED);
		System.out.print("변수 COUNT 값은 ");
		System.out.println(count);
	}
}
