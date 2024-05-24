package Chap07;

public class Cat5 {
	String breed;
	String color;
	Cat5() {
		System.out.println("Cat5() 생성자 호출합니다.");
	}
	Cat5(String pBreed) {
		System.out.println("Cat5(...) 생성자 호출합니다.");
		breed = pBreed;
	}
	Cat5(String pBreed, String pColor) {
		System.out.println("Cat5(..., ...) 생성자 호출합니다.");
		breed = pBreed;
		color = pColor;
	}
	void eat() {
		System.out.println("먹이를 먹다.");
	}
	void scratch() {
		System.out.println("발톱으로 할퀴다.");
	}
	void meow() {
		System.out.println("야옹하고 울다.");
	}
}
