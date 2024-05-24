package Chap04;

import java.util.Scanner; //Scanner클래스를 사용하기 위해 추가

public class Loop04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s를 생성
		System.out.print("길이 : "); //내용 출력
		
		int len = s.nextInt(); //integer로 입력받은 내용을 int형 변수 len에 저장
		
		for(int i = 0; i < len; i++) { //0부터 변수 len-1까지 1씩 증가: 세로 길이
			for(int j = 0; j < i; j++) { //0부터 변수 i-1까지 1씩 증가: 빈 칸 갯수
				System.out.print(" "); //빈 칸 출력
			}
			for(int j = 0; j < (2 * len) - 1 - (i * 2); j++) { //0부터 (2 * len) - 1 - (i * 2) - 1까지 1씩 증가: 별 갯수
				System.out.print("*"); //별 출력
			}
			System.out.println(); //줄 바꿈
		}
	}

}
