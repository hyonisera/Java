package Chap03;

public class Example06_2 { //클래스명 Example06_2로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100; //정수형 int 변수 i 100으로 초기화
		long l = i; //정수형 long 변수에 int 값을 할당, int 값을 long으로 변환하여 long 변수에 저장
		float f = l; //실수형 float 변수에 long 값을 할당, long 값을 float로 변환하여 float 변수에 저장
		System.out.println(i); //변수 i 값 100 출력
		System.out.println(l); //변수 l 값 100 출력
		System.out.println(f); //변수 f 값 100.0 출력
	}

}
