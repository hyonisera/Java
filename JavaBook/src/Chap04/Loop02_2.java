package Chap04;

import java.util.Scanner; //Scanner클래스를 사용하기 위해 추가

public class Loop02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s를 생성
		int choice = 1; //int형 변수 choice 선언 및 1로 초기화
		while(choice == 1) { //변수 choice가 1인 경우
			int a; //int형 변수 a 선언
			
			System.out.println("숫자를 입력하세요."); //큰따옴표 안의 문자열 출력
			a = s.nextInt(); //integer로 입력받은 내용을 변수 a에 저장
			
			if(a % 2 == 0) { //변수 a에 2를 나눈 나머지값이 0인 경우
				System.out.println("짝수입니다."); //큰따옴표 안의 문자열 출력
			}
			else { //그 외의 경우
				System.out.println("홀수입니다."); //큰따옴표 안의 문자열 출력
			}
			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요."); //조건문 출력 후 큰따옴표 안의 문자열 출력
			
			choice = s.nextInt(); //integer로 입력받은 내용을 변수 choice에 저장
		}
		System.out.println("모든 숫자를 확인했습니다."); //while문이 끝나면 큰따옴표 안의 문자열 출력
	}

}
