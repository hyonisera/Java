package Chap04;

import java.util.Scanner; //Scanner클래스를 사용하기 위해 추가

public class Loop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s를 생성
		System.out.println("10보다 큰 숫자를 입력하세요."); //큰따옴표 안의 문자열 출력
		int x = s.nextInt(); //integer로 입력받은 내용을 int형 변수 x에 저장
		int sum = 0; //int형 변수 sum 선언 및 초기화
		
		//조건식을 확인하기 전에 코드 한 번 실행
		do {
			sum += x; //변수 sum에 변수 x를 더한 값을 sum에 할당
			x--; //현재 변수 x 값을 출력하고, 그 후에 x를 1 감소시킴
		} while(x >= 10); //조건식: 변수 x가 10 이상인 경우
		System.out.println("합계 : " + sum); //큰따옴표 안의 문자열과 변수 sum 결합하여 출력
	}

}
