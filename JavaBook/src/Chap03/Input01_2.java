package Chap03;

import java.util.Scanner; //Scanner 클래스의 패키지를 임포트

public class Input01_2 { //클래스명 Input01_2로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in); //키보드로 데이터를 입력받기 위해 System.in 객체와 연결된 Scanner 클래스의 객체 s1을 생성함
		System.out.println("정숫값 입력하기"); //큰따옴표 안의 문자열 출력
		int n = s1.nextInt(); //nextInt() 메서드를 이용해 키보드로 integer를 입력받고, int형 n 변수에 넣어준다
		
		System.out.println("실숫값 입력하기"); //큰따옴표 안의 문자열 출력
		double db = s1.nextDouble(); //nextDouble() 메서드를 이용해 키보드로 double을 입력받고, double형 db 변수에 넣어준다
		System.out.println("정숫값: " + n); //큰따옴표 안의 문자열과 변수 n을 결합하여 출력한다
		System.out.println("실숫값: " + db); //큰따옴표 안의 문자열과 변수 db를 결합하여 출력한다
	}

}
