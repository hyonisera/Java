package Chap05;

public class Method04_2 {
	public static void sum() { //매개변수와 반환 값이 없는 sum() 메서드 선언
		int sum = 0; //int형 변수 sum 선언 및 초기화
		for(int i = 0; i <= 10; i++) { //int형 변수 i가 0부터 10까지 1씩 증가
			sum += i; //변수 sum에 변수 i를 더한 값을 sum에 저장
		}
		System.out.println(sum); //변수 sum 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1부터 10의 합계: "); //큰따옴표 안의 문자열 출력
		sum(); //sum() 메서드 호출
	}

}
