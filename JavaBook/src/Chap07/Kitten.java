package Chap07;

public class Kitten extends ParentCat { //자식
	static void methodKitten() {
		System.out.println("아기 고양이");
	}
	public static void main(String[] args) {
		methodParentCat();
		methodKitten();
	}
}
