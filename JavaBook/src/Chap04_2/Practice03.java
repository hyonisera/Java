package Chap04_2;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 3; i++) {
			int a = 3 * i + 1;
			int b = 3 * i + 2;
			int c = 3 * i + 3;
			System.out.println("*******************************************");
			System.out.println("구구단 " + a + "단 \t" + "구구단 " + b + "단 \t" + "구구단 " + c + "단");
			System.out.println("*******************************************");
			for(int j = 1; j < 10; j++) {
				System.out.println(a + " * " + j + " = " + (a * j) + " \t" + b + " * " + j + " = " + (b * j) + " \t" + c + " * " + j + " = " + (c * j));
			}
		}
		/*for(int i = 0; i < 3; i++) {
			System.out.println("*******************************************");
			System.out.println("구구단 " + (3 * i + 1) + "단 \t" + "구구단 " + (3 * i + 2) + "단 \t" + "구구단 " + (3 * i + 3) + "단");
			System.out.println("*******************************************");
			for(int j = 1; j < 10; j++) {
				System.out.println((3 * i + 1) + " * " + j + " = " + ((3 * i + 1) * j) + " \t" + (3 * i + 2) + " * " + j + " = " + ((3 * i + 2) * j) + " \t" + (3 * i + 3) + " * " + j + " = " + ((3 * i + 3) * j));
			}
		}*/
	}

}
