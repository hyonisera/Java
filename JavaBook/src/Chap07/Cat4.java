package Chap07;

public class Cat4 {
	String breed;
	String color;
	Cat4() {
		System.out.println("Cat4() 생성자 호출합니다.");
	}
	Cat4(String pBreed) {
		System.out.println("Cat(...) 생성자 호출합니다.");
		breed = pBreed;
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
