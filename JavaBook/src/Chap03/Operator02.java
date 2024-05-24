package Chap03;

public class Operator02 { //클래스명 Operator02로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 25; //정수형 변수 a는 10으로 초기화, b는 25로 초기화
		System.out.println("a == b = " + (a == b)); //변수 a와 b가 같은지 비교, 거짓이기 때문에 출력은 a == b = false가 됨
		System.out.println("a != b = " + (a != b)); //변수 a와 b가 다른지 비교, 참이기 때문에 출력은 a != b = true가 됨
		System.out.println("a > b = " + (a > b)); //변수 a가 b보다 큰지 비교, 거짓이기 때문에 출력은 a > b = false가 됨
		System.out.println("a < b = " + (a < b)); //변수 a가 b보다 작은지 비교, 참이기 때문에 출력은 a < b = true가 됨
		System.out.println("b >= a = " + (b >= a)); //변수 b가 a보다 크거나 같은지 비교, 참이기 때문에 출력은 b >= a = true가 됨
		System.out.println("b <= a = " + (b <= a)); //변수 b가 a보다 작거나 같은지 비교, 거짓이기 때문에 출력은 b <= a = false가 됨
	}

}
