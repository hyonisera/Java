package Chap04_2;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 3; i++) {
			int a = i + 1;
			int b = i + 4;
			int c = i + 7;
			System.out.println("********** \t********** \t**********");
			System.out.println("구구단 " + a + "단 \t" + "구구단 " + b + "단 \t" + "구구단 " + c + "단");
			System.out.println("********** \t********** \t**********");
			for(int j = 1; j < 10; j++) {
				System.out.println(a + " * " + j + " = " + (a * j) + " \t" + b + " * " + j + " = " + (b * j) + " \t" + c + " * " + j + " = " + (c * j) + " \t");
			}
		}
	}

}
