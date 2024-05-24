package Chap07;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat2 catObj = new Cat2();
		System.out.println("페르시안 고양이");
		catObj.meow();
		catObj.color = "갈색"; //catObj에 있는 color가 갈색, Cat2클래스의 color가 갈색이 아님
	}

}
