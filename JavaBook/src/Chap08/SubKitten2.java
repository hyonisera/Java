package Chap08;

public class SubKitten2 extends SuperCat2 {
	String name;
	String age = "2살";
	public SubKitten2(String n1, String n2) {
		super(n1); //부모의 생성자를 호출, 꼭 첫 줄에 있어야 함
		System.out.println("아기 고양이입니다." + " 이름은 " + name);
	}
}
