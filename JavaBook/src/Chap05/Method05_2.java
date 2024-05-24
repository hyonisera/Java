package Chap05;

public class Method05_2 {
	public static void calculate(int x, double y) { //매개변수가 있고 반환 값이 없는 calculate() 메서드 선언
		System.out.println(2 * x * y); //받은 int형 변수 x 값과 double형 변수 y 값과 2를 모두 곱한 값을 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4; //int형 변수 a 선언 및 초기화
		double pi = 3.14; //double형 변수 pi 선언 및 초기화
		System.out.println("원의 둘레 구하는 공식: 2 x 반지름 x 원주율"); //큰따옴표 안의 문자열 출력
		
		System.out.print("2 x " + a + " x " + pi + " = "); //큰따옴표 안의 문자열과 변수 a, pi 결합하여 출력
		calculate(a, pi); //calculate() 메서드 호출
	}

}
