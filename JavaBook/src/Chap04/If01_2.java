package Chap04;

import java.util.Scanner; //Scanner클래스를 사용하기 위해 추가

public class If01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 나이를 입력하세요."); //큰따옴표 안의 문자열 출력
		
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s를 생성
		int age = s.nextInt(); //integer로 입력받은 내용을 int형 변수 age에 저장
		
		if(age >= 18) { //변수 age가 18 이상인 경우
			System.out.println("당신의 나이는 18세 이상입니다."); //큰따옴표 안의 문자열 출력
			System.out.println("당신은 투표할 자격이 있습니다."); //큰따옴표 안의 문자열 출력
		}
		System.out.println("이 문장은 if문 외부에 있습니다."); //위 조건에 상관없이 큰따옴표 안의 문자열 출력
	}

}
