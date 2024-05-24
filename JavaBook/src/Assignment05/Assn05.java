package Assignment05;

import java.util.Scanner;

public class Assn05 {
	public static void loop() { //매개변수와 반환 값 모두 없는 loop() 메서드 선언
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s 생성
		int choice = 1; //int형 변수 choice 선언 및 1로 초기화
		while(choice == 1) { //변수 choice가 1인 경우 반복
			int a; //int형 변수 a 선언
			System.out.println("숫자를 입력하세요."); //큰따옴표 안의 문자열 출력
			a = s.nextInt(); //Integer로 입력받은 내용을 변수 a에 저장
			
			if(a % 2 == 0) { //변수 a에 2를 나눈 나머지값이 0인 경우 = 짝수인 경우
				System.out.println("짝수입니다."); //큰따옴표 안의 문자열 출력
			}
			else { //그 외의 경우 = 홀수인 경우
				System.out.println("홀수입니다."); //큰따옴표 안의 문자열 출력
			}
			do { //조건식을 확인하기 전에 한 번 실행
				System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요."); //큰따옴표 안의 문자열 출력
				choice = s.nextInt(); //Integer로 입력받은 내용을 변수 choice에 저장
				if(choice != 0 && choice != 1) { //변수 choice가 0과 1이 아닌 경우
					System.out.println("잘못된 입력입니다. 다시 입력하세요."); //큰따옴표 안의 문자열 출력
				}
			} while(choice != 0 && choice != 1); //변수 choice가 0과 1이 아닌 경우 반복
		}
		System.out.println("프로그램을 종료합니다."); //변수 choice가 0인 경우 큰따옴표 안의 문자열 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop(); //loop() 메서드 호출
	}
}
