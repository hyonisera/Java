package Chap03;

public class Example05_2 { //클래스명 Example05_2로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; //정수형 변수 x 10으로 초기화
		System.out.println(x++); //현재 변수 x 값을 출력하고, 그 후에 x를 1 증가시키므로 10이 출력되지만 11이 담겨져 있다
		System.out.println(++x); //변수 x를 1 증가시키고 나서, 그 증가된 값을 출력하므로 12가 출력된다
		System.out.println(x--); //현재 변수 x 값을 출력하고, 그 후에 x를 1 감소시키므로 12가 출력되지만 11이 담겨져 있다
		System.out.println(--x); //변수 x를 1 감소시키고 나서, 그 감소된 값을 출력하므로 10이 출력된다
	}

}
