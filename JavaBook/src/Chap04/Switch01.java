package Chap04;

import java.util.Scanner; //Scanner클래스를 사용하기 위해 추가

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요."); //큰따옴표 안의 문자열 출력
		
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s를 생성
		int num = s.nextInt(); //integer로 입력받은 내용을 int형 변수 num에 저장
		
		switch (num / 10) { //조건식: 변수 num에 10을 나눈 몫
		case 10: //몫이 10과 같을 경우 case 9로 넘어감
		case 9: //몫이 9와 같을 경우
			System.out.println("A학점"); //큰따옴표 안의 문자열 출력
			break; //종료
		case 8: //몫이 8과 같을 경우
			System.out.println("B학점"); //큰따옴표 안의 문자열 출력
			break; //종료
		case 7: //몫이 7과 같을 경우
			System.out.println("C학점"); //큰따옴표 안의 문자열 출력
			break; //종료
		case 6: //몫이 6과 같을 경우
			System.out.println("D학점"); //큰따옴표 안의 문자열 출력
			break; //종료
		default: //몫과 일치하는 case문이 없는 경우
			System.out.println("F학점"); //큰따옴표 안의 문자열 출력
			break; //종료
		}
	}

}
