package Chap03;

public class Example07_2 { //클래스명 Example07_2로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 3.14; //실수형 double 변수 d 3.14로 초기화
		long l = (long)d; //double형 변수 d 값을 정수형 long 변수 l 값으로 변환, 소수점 아래는 손실됨
		int i = (int)l; //long형 변수 l 값을 int형 변수 i 값으로 변환
		System.out.println(d); //변수 d 값 3.14 출력
		System.out.println(l); //변수 l 값 3 출력
		System.out.println(i); //변수 i 값 3 출력
	}

}
