package Assignment04;

import java.util.Scanner; //Scanner클래스를 사용하기 위해 추가

public class Assn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[메뉴] 1:검색 2:등록 3:삭제 4:변경 >"); //큰따옴표 안의 문자열 출력
		
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s 생성
		int selected = s.nextInt(); //integer로 입력받은 내용을 int형 변수 selected에 저장
		
		switch(selected) { //조건식: 변수 selected
		case 1: //변수 selected 값이 1과 같을 경우
			System.out.println("검색합니다."); //큰따옴표 안의 문자열 출력
			break; //종료
		case 2: //변수 selected 값이 2과 같을 경우
			System.out.println("등록합니다."); //큰따옴표 안의 문자열 출력
			break; //종료
		case 3: //변수 selected 값이 3과 같을 경우
			System.out.println("삭제합니다."); //큰따옴표 안의 문자열 출력
			break; //종료
		case 4: //변수 selected 값이 4과 같을 경우
			System.out.println("변경합니다."); //큰따옴표 안의 문자열 출력
			break; //종료
		default: //변수 selected가 1부터 4 사이의 값이 아닌 경우
			break; //종료
		}
	}

}
