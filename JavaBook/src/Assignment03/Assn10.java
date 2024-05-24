package Assignment03;

public class Assn10 { //클래스명 Assn10으로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2; //정수형 int 변수 x 선언 및 2로 초기화
		int y = 5; //정수형 int 변수 y 선언 및 5로 초기화
		char c = 'A'; //문자형 char 변수 c 선언 및 'A'로 초기화
		
		//1 + x를 왼쪽으로 33비트 시프트, 1 + x = 3이므로 2진수로 나타내면 0011, int형은 32비트이므로 0011을 왼쪽으로 33비트 이동하면 0110이 되므로 6 출력
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2); //y가 5 이상이거나 (x가 0보다 작고 2보다 큰지)에 대해 y가 5 이상이라는 한 조건이 참이므로 true 출력
		System.out.println(y += 10 - x++); //y에 10을 더한 값인 15가 y에 할당되고, x++은 현재 변수 x를 먼저 출력한 이후 x를 1 증가시키므로 2이다. 따라서 15 - 2 = 13이 출력된다
		System.out.println(!('A' <= c && c <= 'Z')); //변수 c는 'A' 이상이고 'Z' 이하인지에 대해 참인데, 조건을 부정하므로 false 출력
		System.out.println('C' - c); //'C'는 아스키코드 67이고, 변수 c 값인 'A'는 아스키코드 65이므로 67 - 65 = 2 출력
		System.out.println(c + 1); //변수 c 값 'A'의 아스키코드 65에 1을 더한 값 66 출력
		System.out.println(c++); //현재 변수 c를 먼저 출력한 이후 c를 1 증가시키므로 'A'가 출력되지만 'B'가 담겨져 있다
		System.out.println(c); //변수 c = 'B' 출력
		System.out.println(++c); //변수 c를 1 증가시키고 나서, 그 증가된 값을 출력하므로 'C' 출력
	}

}
