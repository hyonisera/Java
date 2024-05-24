package Chap03;

public class Operator03 { //클래스명 Operator03으로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 10; //정수형 변수 a는 5, b는 10으로 초기화
		
		System.out.println(a > b); //a가 b보다 큰지 판단, 거짓이기 때문에 false 출력
		System.out.println(!(a > b)); //a가 b보다 큰지 판단 후 부정, 참이기 때문에 true 출력
		System.out.println((a == b) && (a == 5)); //a와 b가 같고 동시에 a가 5와 같은지 판단, 거짓이기 때문에 false 출력
		System.out.println((a != b) && (a == 5)); //a와 b가 다르고 동시에 a가 5와 같은지 판단, 참이기 때문에 true 출력
		System.out.println(!((a != b) && (a == 5))); //a와 b가 다르고 동시에 a가 5와 같은지 판단 후 부정, 거짓이기 때문에 false 출력
	}

}
