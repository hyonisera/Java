package Chap06;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
		double sum = 0.0;
		
		for(int i = 0; i < gradeArr.length; i++) {
			sum += gradeArr[i];
		}
		
		double average = sum / gradeArr.length;
		System.out.println("합계: " + sum);
		System.out.format("평균: %.2f", average); //printf랑 같은거
		
		System.out.println();
		System.out.println("average: " + average);
		System.out.printf("평균: %.2f", average);
		System.out.println();
		System.out.println("평균: " + String.format("%.2f", average));
		System.out.println(Math.round(average * 100)/100.0);
	}

}
