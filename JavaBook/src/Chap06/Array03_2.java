package Chap06;

import java.util.Scanner;

public class Array03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] marks = new double[2][3]; //2행 3열의 2차원 배열 생성: 학생 2명의 국어점수, 수학점수, 평균
		Scanner s = new Scanner(System.in); //Scanner 객체 생성
		
		for(int i = 0; i < 2; i++) {
			System.out.println("학생번호" + (i + 1)); //학생번호 출력
			System.out.print("국어점수 : ");
			marks[i][0] = s.nextDouble(); //입력받은 국어점수를 marks 배열 1열에 저장
			
			System.out.print("수학점수 : "); 
			marks[i][1] = s.nextDouble(); //입력받은 수학점수를 mark 배열 2열에 저장
			
			marks[i][2] = (marks[i][0] + marks[i][1]) / 2; //각 학생의 평균을 구하여 marks 배열 3열에 저장
		}
		
		//각 학생의 번호, 국어점수, 수학점수, 평균 출력
		for(int i = 0; i < 2; i++) {
			System.out.println("학생번호" + (i + 1));
			System.out.print("국어" + ":" + marks[i][0] + " ");
			System.out.print("수학" + ":" + marks[i][1] + " ");
			System.out.println("평균" + ":" + marks[i][2] + " ");
		}
	}

}
