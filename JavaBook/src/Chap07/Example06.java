package Chap07;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat5 cat1 = new Cat5();
		Cat5 cat2 = new Cat5("샴");
		Cat5 cat3 = new Cat5("러시안블루", "회색");
		
		System.out.println("첫 번째 고양이 품종: " + cat1.breed + "\t색상: " + cat1.color);
		System.out.println("두 번째 고양이 품종: " + cat2.breed + "\t색상: " + cat2.color);
		System.out.println("세 번째 고양이 품종: " + cat3.breed + "\t색상: " + cat3.color);
	}

}
