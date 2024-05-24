package Assignment03;

public class Assn9 { //클래스명 Assn9로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.123456789f; //실수형 float 변수 f 선언 및 9.123456789f로 초기화했지만 float형식에 맞게 9.123457로 반올림됨
		double d = 9.123456789; //실수형 double 변수 d 선언 및 9.123456789로 초기화
		double d2 = (double)f; //float형 변수 f 값을 double형으로 변환하여 그 값을 double형 변수 d2에 저장
		
		//float형 실수를 출력시 소수점 6자리까지만 출력되고, 출력하고자 하는 실수가 소수점 6자리를 넘으면 반올림 된다
		//double형 실수를 출력시 소수점 16자리까지 출력된다
		//float형에서 double형으로 변환될 때 부동 소수점 표현의 한계로 정밀도 손실이 발생하므로 변수 f 값 9.123456 아래부터는 쓰레기값이 붙음
		System.out.println("f = " + f); //큰따옴표 안의 문자열과 변수 f 출력, f = 9.123457이라고 출력됨
		System.out.println("d = " + d); //큰따옴표 안의 문자열과 변수 d 출력, d = 9.123456789라고 출력됨
		System.out.println("d2 = " + d2); //큰따옴표 안의 문자열과 변수 d2 출력
	}

}
