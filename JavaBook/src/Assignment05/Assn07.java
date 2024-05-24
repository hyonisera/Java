package Assignment05;

import java.util.Scanner;

public class Assn07 {
	public static void star(int num) { //매개변수 int형 변수 num이 있고 반환 값이 없는 star() 메서드 선언
		int n = 1; //int형 변수 n 선언 및 1로 초기화
		while(true) { //조건이 참이므로 무한반복
			for(int i = 0; i < num; i++) { //int형 변수 i가 0부터 num-1까지 1씩 증가
				System.out.print(" "); //빈 칸 출력
			}
			for(int i = 0; i < n; i++) { //int형 변수 i가 0부터 n-1까지 1씩 증가
				System.out.print("*"); //별 출력
			}
			System.out.println(); //줄 바꿈
			num -= 1; //변수 num에 1을 뺀 값을 num에 저장: 빈 칸
			n += 2; //변수 n에 2를 더한 값을 n에 저장: 별
			
			if(num < 0) break; //변수 num이 0보다 작은 경우 종료
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요: "); //큰따옴표 안의 문자열 출력
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s 생성
		int num = s.nextInt(); //Integer로 입력받은 내용을 int형 변수 num에 저장
		
		star(num); //star() 메서드 호출
	}

}
