package Chap04;

import java.util.Scanner; //Scanner클래스를 사용하기 위해 추가

public class If02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요."); //큰따옴표 안의 문자열 출력
		
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s를 생성
		int num = s.nextInt(); //integer로 입력받은 내용을 int형 변수 num에 저장
		
		if(num % 2 == 0) { //변수 num을 2로 나눈 나머지값이 0인 경우
			System.out.println(num + "은 짝수입니다."); //변수 num과 큰따옴표 안의 문자열 출력
		}
		else { //위 조건이 아닌 나머지
			System.out.println(num + "은 홀수입니다."); //변수 num과 큰따옴표 안의 문자열 출력
		}
		System.out.println("이 문장은 if문 외부에 있습니다."); //조건문 상관없이 큰따옴표 안의 문자열 출력
	}

}
