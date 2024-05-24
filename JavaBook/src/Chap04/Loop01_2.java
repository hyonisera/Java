package Chap04;

import java.util.Scanner; //Scanner클래스를 사용하기 위해 추가

public class Loop01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //int형 변수 sum 선언 및 초기화
		System.out.println("5개의 숫자를 입력하세요."); //큰따옴표 안의 문자열 출력
		
		for(int n = 1; n <= 5; n++) { //초기화식: n = 1; 조건식: n <= 5; 증감식: n++, 1부터 5까지 1씩 증가
			Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s를 생성
			int num = s.nextInt(); //integer로 입력받은 내용을 int형 변수 num에 저장
			sum += num; //변수 sum에 변수 num을 더한 값 sum에 할당
		}
		System.out.println("합계 : " + sum); //큰따옴표 안의 문자열과 변수 sum 결합하여 출력
	}

}
