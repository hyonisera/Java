package Chap04;

import java.util.Scanner; //Scanner클래스를 사용하기 위해 추가

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3개의 숫자를 입력하세요."); //큰따옴표 안의 문자열 출력
		
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s를 생성
		int x = s.nextInt(); //integer로 입력받은 내용을 int형 변수 x에 저장
		int y = s.nextInt(); //integer로 입력받은 내용을 int형 변수 y에 저장
		int z = s.nextInt(); //integer로 입력받은 내용을 int형 변수 z에 저장
		
		if(x > y) { //변수 x가 변수 y보다 큰 경우
			if(x > z) { //변수 x가 변수 z보다 큰 경우
				System.out.println(x + "는 가장 큰 정수입니다."); //변수 x와 큰따옴표 안의 문자열 결합하여 출력
			}
			else { //(x > y)조건은 참이지만 (x > z)조건이 거짓인 경우
				System.out.println(x + "는 가장 큰 정수가 아닙니다."); //변수 x와 큰따옴표 안의 문자열 결합하여 출력
			}
		}
		else { //(x > y)조건이 거짓인 경우
			System.out.println(x + "는 가장 큰 정수가 아닙니다."); //변수 x와 큰따옴표 안의 문자열 결합하여 출력
		}
	}

}
