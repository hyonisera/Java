package Chap07;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat1 catObj = new Cat1();
		catObj.breed = "페르시안 고양이"; //.으로 접근
		catObj.color = "흰색";
		System.out.println("품종: " + catObj.breed);
		System.out.println("색상: " + catObj.color);
	}

}
