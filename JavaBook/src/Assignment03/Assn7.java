package Assignment03;

public class Assn7 { //클래스명 Assn7로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345"; //문자열형 String 변수 s 선언 및 "12345"로 초기화
		int i = Integer.parseInt(s); //문자열을 정수형으로 변환하여 정수형 int 변수 i에 저장
		System.out.printf("문자를 숫자로 %d (%d) \n", i, i + 10); //정수 12345를 출력하고, 그 뒤에 정수에 10을 더한 값 12355를 함께 출력
		
		String a; //문자열형 String 변수 a 선언
		a = String.format("%d", i); //문자열에서 정수형으로 변환된 값을 다시 문자열로 변환하여 변수 a에 저장
		
		System.out.printf("숫자를 문자로 %s (%s) \n", a, a + "abcde"); //문자열 "12345"를 출력하고, 그 뒤에 문자열에 "abcde"를 이어붙인 값 "12345abcde"를 함께 출력
	}

}
