package Assignment04;

public class Assn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //int형 변수 sum 선언 및 초기화
		for(int i = 0; i < 10; i++) { //초기화: int i = 0; 조건식: i < 10; 증감식: i++, int형 변수 i가 0부터 9까지 1씩 증가
			sum = sum + i; //변수 sum에 변수 i를 더한 값을 sum에 할당 = 0부터 9까지의 합
		}
		System.out.println("sum: " + sum); //큰따옴표 안의 문자열과 변수 sum 결합하여 출력
	}

}
