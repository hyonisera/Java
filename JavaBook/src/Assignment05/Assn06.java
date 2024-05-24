package Assignment05;

import java.util.Scanner;

public class Assn06 {
	public static void max(int x, int y, int z) { //매개변수 int형 변수 x, y, z가 있고 반환 값이 없는 max() 메서드 선언
		if(x > y && x > z) {  //변수 x가 변수 y와 z보다 큰 경우
			System.out.println(x + "은(는) 가장 큰 정수입니다."); //변수 x와 큰따옴표 안의 문자열 결합하여 출력
		}
		else if(y > x && y > z) { //변수 y가 변수 x와 z보다 큰 경우
			System.out.println(y + "은(는) 가장 큰 정수입니다."); //변수 y와 큰따옴표 안의 문자열 결합하여 출력
		}
		else if(z > x && z > y) { //변수 z가 변수 x와 y보다 큰 경우
			System.out.println(z + "은(는) 가장 큰 정수입니다."); //변수 z와 큰따옴표 안의 문자열 결합하여 출력
		}
	}
	
	public static void min(int x, int y, int z) { //매개변수 int형 변수 x, y, z가 있고 반환 값이 없는 min() 메서드 선언
		if(x < y && x < z) { //변수 x가 변수 y와 z보다 큰 경우
			System.out.println(x + "은(는) 가장 작은 정수입니다."); //변수 x와 큰따옴표 안의 문자열 결합하여 출력
		}
		else if(y < x && y < z) { //변수 y가 변수 x와 z보다 큰 경우
			System.out.println(y + "은(는) 가장 작은 정수입니다."); //변수 y와 큰따옴표 안의 문자열 결합하여 출력
		}
		else if(z < x && z < y) { //변수 z가 변수 x와 y보다 큰 경우
			System.out.println(z + "은(는) 가장 작은 정수입니다."); //변수 z와 큰따옴표 안의 문자열 결합하여 출력
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3개의 숫자를 입력하세요."); //큰따옴표 안의 문자열 출력
		
		Scanner s = new Scanner(System.in); //Scanner클래스의 객체 s 생성
		
		int x = s.nextInt(); //Integer로 입력받은 내용을 int형 변수 x에 저장
		int y = s.nextInt(); //Integer로 입력받은 내용을 int형 변수 y에 저장
		int z = s.nextInt(); //Integer로 입력받은 내용을 int형 변수 z에 저장
		
		max(x, y, z); //max() 메서드 호출
		min(x, y, z); //min() 메서드 호출
	}

}
