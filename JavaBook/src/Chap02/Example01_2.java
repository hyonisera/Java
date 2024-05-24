package Chap02;

public class Example01_2 { //클래스명을 Example01_2로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SPEED = 20; //SPEED를 정수형 상수 20으로 초기화
		int count = 10; //count를 정수형 변수 10으로 초기화
		//SPEED = 40; //SPEED는 상수이기 때문에 값이 바뀔 수 없어서 주석 처리
		count = 11; //count는 변수이기 때문에 값을 11로 바꿀 수 있음
		
		System.out.print("상수 SPEED 값은 "); //"" 안의 문장 출력
		System.out.println(SPEED); //SPEED 상수 출력
		System.out.print("변수 count 값은 "); //"" 안의 문장 출력
		System.out.println(count); //count 변수 출력
	}

}
