package Chap05;

public class Method01_2 {
	public static void method() { //매개변수와 반환 값이 없는 method 메서드 선언
		System.out.println("static 메서드입니다."); //큰따옴표 안의 문자열 출력
		System.out.println(5 + 6); //11 출력
	}

	public static void main(String[] args) { //메인 메서드
		// TODO Auto-generated method stub
		System.out.println("첫 번째 호출 메서드입니다."); //큰따옴표 안의 문자열 출력
		method(); //method 메서드 호출
		
		System.out.println("두 번째 호출 메서드입니다."); //큰따옴표 안의 문자열 출력
		method(); //method 메서드 호출
	}

}
