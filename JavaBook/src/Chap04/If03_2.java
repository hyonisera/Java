package Chap04;

import java.util.Scanner; //Scanner클래스를 사용하기 위해 추가

public class If03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요."); //큰따옴표 안의 문자열 출력
		
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s를 생성
		int grade = s.nextInt(); //integer로 입력받은 내용을 int형 변수 grade에 저장
		
		if(grade >= 90) { //변수 grade가 90 이상인 경우
			System.out.println("A학점"); //큰따옴표 안의 문자열 출력
		}
		else if(grade >= 80) { //변수 grade가 80 이상인 경우
			System.out.println("B학점"); //큰따옴표 안의 문자열 출력
		}
		else if(grade >= 70) { //변수 grade가 70 이상인 경우
			System.out.println("C학점"); //큰따옴표 안의 문자열 출력
		}
		else if(grade >= 60) { //변수 grade가 60 이상인 경우
			System.out.println("D학점"); //큰따옴표 안의 문자열 출력
		}
		else { //그 외의 경우
			System.out.println("F학점"); //큰따옴표 안의 문자열 출력
		}
	}

}
