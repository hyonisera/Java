package Chap06;

import java.util.Scanner;

public class Array01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myArr; //myArr문자열 배열 선언
		myArr = new String[3]; //3개의 문자열을 저장할 메모리 할당
		
		Scanner s = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("3개 문자열을 입력하세요.");
		
		for(int i = 0; i < 3; i++) { //인덱스 0부터 2까지 1씩 증가
			myArr[i] = s.nextLine(); //입력받은 문자열을 순서대로 myArr배열에 저장
		}
		for(int i = 0; i < 3; i++) { //인덱스 0부터 2까지 1씩 증가
			System.out.print(myArr[i] + " "); //입력받은 문자열 순서대로 한 칸씩 띄어서 출력
		}
	}

}
