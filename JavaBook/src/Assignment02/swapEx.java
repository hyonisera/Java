package Assignment02;

public class swapEx { //클래스명 swapEx로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; //정수형 int 변수 x를 10으로 초기화
		int y = 20; //정수형 int 변수 y를 20으로 초기화
		int temp = 0; //임시 저장공간 정수형 int 변수 temp 선언 및 0으로 초기화
		
		System.out.println("x와 y의 값을 확인합니다."); //큰따옴표 안의 문자열 출력
		System.out.println("x값: " + x); //큰따옴표 안의 문자열과 변수를 결합하여 출력
		System.out.println("y값: " + y + "\n"); //큰따옴표 안의 문자열과 변수를 결합하여 출력한 뒤 줄 바꿈
		
		temp = x; //0으로 초기화된 temp 변수에 x 변수의 값 10을 넣어준다
		x = y; //y 변수의 값 20을 x 변수에 넣어준다
		y = temp; //temp 변수의 값 10을 y 변수에 넣어줌으로써 x와 y의 값 교환
		
		System.out.println("x와 y의 값을 변경합니다."); //큰따옴표 안의 문자열 출력
		System.out.println("x값: " + x); //큰따옴표 안의 문자열과 변수를 결합하여 출력
		System.out.println("y값: " + y); //큰따옴표 안의 문자열과 변수를 결합하여 출력
	}

}
