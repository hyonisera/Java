package Chap05;

public class Method02_2 {
	public static int div() { //매개변수가 없고 반환 값이 있는 div() 메서드 선언
		int a = 10, b = 5; //int형 변수 a와 b 선언 및 초기화
		int result = a / b; //int형 변수 result 선언 및 초기화
		
		return result; //변수 result 값 2 반환
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = div(); //div() 메서드 호출 후 반환 값을 int형 변수 num에 저장
		System.out.println(num); //변수 num 출력
	}

}
