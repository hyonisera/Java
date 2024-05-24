package Chap06;

public class Array02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7}; //실수형 배열 선언 및 초기화
		double sum = 0.0; //실수형 변수 sum 선언 및 초기화
		
		for(int i = 0; i < gradeArr.length; i++) { //gradeArr.length = 10, 인덱스 0부터 9까지 1씩 증가
			sum += gradeArr[i]; //배열 순서대로 합해서 변수 sum에 저장
		}
		
		double average = sum / gradeArr.length; //변수 sum에 10을 나눈 몫 실수형 변수 average에 저장
		System.out.println("합계: " + sum); //변수 sum 출력
		System.out.format("평균: %.2f", average); //소수점 2번째 자리까지 변수 average 출력
		/*위와 같은 출력
		 System.out.printf("평균: %.2f", average);
		 System.out.println("평균: " + String.format("%.2f", average)); //지정된 형식으로 값 포맷 후 그 결과를 문자열로 반환
		 System.out.println(Math.round(average * 100)/100.0); //반올림하여 가장 가까운 정수로 반환 후 소수점 이하 두 자리로 나타냄
		 */
	}

}
