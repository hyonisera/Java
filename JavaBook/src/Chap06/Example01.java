package Chap06;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = new int[5];
		myArr[0] = 10;
		myArr[1] = 20;
		myArr[2] = 30;
		myArr[3] = 40;
		myArr[4] = 50;
		System.out.println("myArr.lenth : " + myArr.length);
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(i + "번째 요소값 : " + myArr[i]);
		}
	}

}
