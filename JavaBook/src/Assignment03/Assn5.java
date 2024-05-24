package Assignment03; //패키지명 Assignment03으로 선언

public class Assn5 { //클래스명 Assn5로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_year = 0; //정수형 int 변수 k01_year 선언 및 초기화
		int k01_age = 14; //정수형 int 변수 k01_age 선언 및 14로 초기화
		
		System.out.println("결과1: " + k01_year); //큰따옴표 안의 문자열과 변수 k01_year 결합하여 출력, 결과1: 0이 출력됨
		System.out.println("결과2: " + k01_age); //큰따옴표 안의 문자열과 변수 k01_age 결합하여 출력, 결과2: 14가 출력됨
		
		k01_year = k01_age + 2000; //변수 k01_age에 2000을 더한 값을 변수 k01_year에 할당, k01_year = 2014
		k01_age = k01_age + 1; //변수 k01_age에 1을 더한 값을 변수 k01_age에 할당, k01_age = 15
		
		System.out.println("결과3: " + k01_year); //큰따옴표 안의 문자열과 변수 k01_year 결합하여 출력, 결과3: 2014가 출력됨
		System.out.println("결과4: " + k01_age); //큰따옴표 안의 문자열과 변수 k01_age 결합하여 출력, 결과4: 15가 출력됨
	}

}
