package Chap05;

public class Example06 {
	public static void calculate(int x, int y) {
		System.out.println(x * y);
	}
	public static void calculate(int x) {
		System.out.println(x * x);
	}
	public static void calculate(int x, double y) {
		System.out.println(x * y);
	}
	public static void calculate(double x) {
		System.out.println(x * x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate(2, 3); //이름이 같으면 오버로딩이라고 함
		calculate(2, 3.14);
		calculate(2);
		calculate(2.5);
	}

}
