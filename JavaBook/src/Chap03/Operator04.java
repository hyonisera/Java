package Chap03;

public class Operator04 { //클래스명 Operator04로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; //정수형 변수 a를 10으로 초기화
		int b = 20; //정수형 변수 b를 20으로 초기화
		int c; //정수형 변수 c 선언
		System.out.println(c = a); //변수 c에 변수 a를 할당, c = 10 출력
		System.out.println(b += a); //변수 b에 a를 더한 값을 b에 할당, b = 20 + 10 = 30 출력
		System.out.println(b -= a); //변수 b에 a를 뺀 값을 b에 할당, b = 30 - 10 = 20 출력
		System.out.println(b *= a); //변수 b에 a를 곱한 값을 b에 할당, b = 20 * 10 = 200 출력
		System.out.println(b /= a); //변수 b를 a로 나누고 몫을 b에 할당, b = 200 / 10 = 20 출력
		System.out.println(b %= a); //변수 b를 a로 나누고 나머지값을 b에 할당, b = 20 % 10 = 0 출력
	}

}
