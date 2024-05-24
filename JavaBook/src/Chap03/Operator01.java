package Chap03;

public class Operator01 { //클래스명 Operator01로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; //정수형 변수 a 10으로 초기화
		double b = 2.0; //실수형 변수 b 2.0으로 초기화
		//정수와 실수를 혼합하여 산술 연산할 때 정수가 실수로 자동 변환되어 계산됨 (자동 형 변환)
		System.out.println("a + b = " + (a + b)); //큰따옴표 안의 문자열과 + 산술연산한 값 12.0을 결합하여 출력
		System.out.println("a - b = " + (a - b)); //큰따옴표 안의 문자열과 - 산술연산한 값 8.0을 결합하여 출력
		System.out.println("a * b = " + (a * b)); //큰따옴표 안의 문자열과 * 산술연산한 값 20.0을 결합하여 출력
		System.out.println("a / b = " + (a / b)); //큰따옴표 안의 문자열과 / 산술연산한 값(몫) 5.0을 결합하여 출력
		System.out.println("a % b = " + (a % b)); //큰따옴표 안의 문자열과 % 산술연산한 값(나머지) 0.0을 결합하여 출력
	}

}
