package Assignment06;

import java.util.Scanner;

public class Assn01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5]; //크기가 5인 정수형 배열 score 선언 및 초기화
		int sum = 0; //정수형 변수 sum 선언 및 초기화
		Scanner s = new Scanner(System.in); //Scanner 객체 생성
		
		for(int i = 0; i < score.length; i++) { //배열의 길이(5)만큼 반복
			System.out.print((i + 1) + "번 학생의 국어 점수: "); //학생 번호 출력
			score[i] = s.nextInt(); //입력받은 점수를 배열 score에 저장
			sum += score[i]; //입력받은 점수를 합하여 변수 sum에 저장
		}
		
		float average = sum / score.length; //평균을 계산하여 실수형 변수 average에 저장
		System.out.println("합계: " + sum); //합계 출력
		System.out.println("평균: " + average); //평균 출력
	}

}
