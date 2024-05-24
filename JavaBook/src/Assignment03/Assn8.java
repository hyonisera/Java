package Assignment03;

public class Assn8 { //클래스명 Assn8로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 85.4; //실수형 double 변수 d 선언 및 85.4로 초기화
		int score = (int)d; //double형 변수 d 값을 정수형 int로 변환하여 int형 변수 score에 저장, 실수에서 정수로 변환되면 소수점 아래가 소실되므로 변수 score에 85가 저장됨
		
		System.out.println("score = " + score); //큰따옴표 안의 문자열과 변수 score 결합하여 출력, score = 85가 출력됨
		System.out.println("d = " + d); //큰따옴표 안의 문자열과 변수 d 결합하여 출력, d = 85.4가 출력됨
	}

}
