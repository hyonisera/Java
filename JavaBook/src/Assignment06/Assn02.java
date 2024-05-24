package Assignment06;

import java.util.Scanner;

public class Assn02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] score = new float[5][5]; //5x5 크기의 2차원 float형 배열 score 선언 및 초기화
		Scanner s = new Scanner(System.in); //Scanner 객체 생성
		
		for(int i = 0; i < 5; i++) { //5번 반복
			System.out.print((i + 1) + "번 학생의 국어 점수: "); //학생 번호 출력
			score[i][0] = s.nextFloat(); //입력받은 국어 점수를 배열에 저장
			System.out.print((i + 1) + "번 학생의 영어 점수: "); //학생 번호 출력
			score[i][1] = s.nextFloat(); //입력받은 영어 점수를 배열에 저장
			System.out.print((i + 1) + "번 학생의 수학 점수: "); //학생 번호 출력
			score[i][2] = s.nextFloat(); //입력받은 수학 점수를 배열에 저장
			
			score[i][3] = score[i][0] + score[i][1] + score[i][2]; //국어, 영어, 수학 점수의 총점을 계산하여 배열에 저장
			score[i][4] = score[i][3] / 3; //총점을 과목 수로 나누어 평균을 계산하고 배열에 저장
		}
		
		for(int i = 0; i < 5; i++) { //5번 반복
			//각 학생의 총점(정수형으로 출력)과 평균을 출력
			System.out.println((i + 1) + "번 학생의 총점: " + (int)score[i][3] + ", " + (i + 1) + "번 학생의 평균: " + score[i][4]);
		}
	}

}
