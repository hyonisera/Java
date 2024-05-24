package Chap03;

public class TypeConversion02 { //클래스명 TypeConversion02로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; //정수형 int 변수 x 10으로 초기화
		double y = 3.0; //실수형 double 변수 y 3.0으로 초기화
		
		System.out.println(x / y); //정수와 실수를 혼합하여 산술연산할 때는 정수가 실수로 자동 변환되므로 3.333333333335 출력
		System.out.println(x / (int)y); //double형 변수 y의 값을 int형으로 변환하면 소수점 아래가 손실되므로 3이 되고, / 산술연산한 값 3이 출력됨
		System.out.println((int)(x / y)); //위에서 자동 형 변환으로 계산한 값 3.333333333335을 int형으로 변환하면 소수점 아래가 손실되므로 3이 출력됨
	}

}
