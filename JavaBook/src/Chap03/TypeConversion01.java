package Chap03;

public class TypeConversion01 { //클래스명 TypeConversion01로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; //정수형 int 변수 x 10으로 초기화
		double y = 3.0; //실수형 double 변수 y 3.0으로 초기화
		//정수와 실수를 혼합하여 산술 연산할 때 정수가 실수로 자동 변환되어 계산됨 (자동 형 변환)
		System.out.println(x + y); // + 산술연산한 값 13.0 출력
		System.out.println(x - y); // - 산술연산한 값 7.0 출력
		System.out.println(x * y); // * 산술연산한 값 30.0 출력
		System.out.println(x / y); // / 산술연산한 값 3.3333333333335 출력
	}

}
