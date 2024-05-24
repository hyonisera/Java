package Chap03;

import java.util.Scanner; //Scanner 클래스의 패키지를 임포트

public class Example08_2 { //클래스명 Example08_2로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //키보드로 데이터를 입력받기 위해 System.in 객체와 연결된 Scanner 클래스의 객체를 생성함
		
		System.out.println("당신의 이름을 입력하세요."); //큰따옴표 안의 내용 출력
		String name = input.nextLine(); //nextLine() 메서드를 이용해 키보드로 한 행의 문자열(공백문자 포함)을 입력받고, 문자열 name 변수에 넣어준다
		System.out.println("당신의 이름: " + name); //큰따옴표 안의 문자열과 변수 name을 결합하여 출력한다
	}

}
