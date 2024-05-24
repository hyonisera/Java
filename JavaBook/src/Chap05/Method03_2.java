package Chap05;

public class Method03_2 {
	public static int max(int x, int y) { //매개변수와 반환 값이 있는 max() 메서드 선언
		int result; //int형 변수 result 선언
		if(x > y) result = x; //x가 y보다 큰 경우 변수 result에 x값 저장
		else result = y; //그 외의 경우 변수 result에 y값 저장
		return result; //변수 result 값 반환
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 6; //int형 변수 a와 b 선언 및 초기화
		int num = max(a, b); //max() 메서드 호출 후 반환 값을 int형 변수 num에 저장
		System.out.println(a + "(와)과 " + b + "의 수 중 " + num + "이 큽니다."); //큰따옴표 안의 문자열과 변수 a, b, num 결합하여 출력
	}

}
