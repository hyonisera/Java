package Chap03;

public class Example03_2 { //클래스명 Example03_2로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; //정수형 변수 x를 10으로 초기화
		System.out.println(x < 10 && x < 20); //x가 10보다 작고 동시에 x가 20보다 작은지 물어봄 거짓이기 때문에 false 반환
		System.out.println(x < 10 || x < 20); //x가 10보다 작거나 x가 20보다 작은지 물어봄 두 조건 중 하나가 참이니 true 반환
		System.out.println(!(x < 10 && x < 20)); //x가 10보다 작고 동시에 x가 20보다 작은 것의 부정을 물어봄 참이기 때문에 true 반환
	}

}
