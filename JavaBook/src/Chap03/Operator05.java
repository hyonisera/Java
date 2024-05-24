package Chap03;

public class Operator05 { //클래스명 Operator05로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 10, c = 10, d = 10; //정수형 변수 a, b, c, d 모두 10으로 초기화
		
		System.out.println("a++ => " + (a++)); //현재 변수 a 값을 출력하고, 그 후에 a를 1 증가시키므로 10이 출력되지만 11이 담겨져 있다
		System.out.println("a => " + a); //변수 a는 11이 출력된다
		System.out.println("++b => " + (++b)); //변수 b를 1 증가시키고 나서, 그 증가된 값을 출력하므로 11이 출력된다
		System.out.println("c-- => " + (c--)); //현재 변수 c 값을 출력하고, 그 후에 c를 1 감소시키므로 10이 출력되지만 9가 담겨져 있다
		System.out.println("--d => " + (--d)); //변수 d를 1 감소시키고 나서, 그 감소된 값을 출력하므로 9가 출력된다
	}

}
